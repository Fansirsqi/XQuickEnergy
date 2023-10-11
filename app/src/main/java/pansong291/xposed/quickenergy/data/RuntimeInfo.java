package pansong291.xposed.quickenergy.data;

import org.json.JSONException;
import org.json.JSONObject;
import pansong291.xposed.quickenergy.util.FileUtils;
import pansong291.xposed.quickenergy.util.FriendIdMap;
import pansong291.xposed.quickenergy.util.Log;

import java.util.Objects;

/**
 * @author Constanline
 * @since 2023/08/18
 */
public class RuntimeInfo {
    private static final String TAG = RuntimeInfo.class.getCanonicalName();

    private static RuntimeInfo instance;

    public static String process;

    private final String userId;

    private JSONObject joAll;

    private JSONObject joCurrent;

    public enum RuntimeInfoKey {
        ForestPauseTime
    }

    public static RuntimeInfo getInstance() {
        if (instance == null || !Objects.equals(instance.userId, FriendIdMap.currentUid)) {
            instance = new RuntimeInfo();
        }
        return instance;
    }

    private RuntimeInfo() {
        userId = FriendIdMap.currentUid;
        String content = FileUtils.readFromFile(FileUtils.runtimeInfoFile());
        try {
            joAll = new JSONObject(content);
        } catch (Exception ignored) {
            joAll = new JSONObject();
        }
        try {
            if (!joAll.has(userId)) {
                joAll.put(userId, new JSONObject());
            }
        } catch (Exception ignored) {
        }
        try {
            joCurrent = joAll.getJSONObject(userId);
        } catch (Exception ignored) {
            joCurrent = new JSONObject();
        }
    }

    public void save() {
        FileUtils.write2File(joAll.toString(), FileUtils.runtimeInfoFile());
    }

    public Object get(RuntimeInfoKey key) throws JSONException {
        return joCurrent.opt(key.name());
    }

    public String getString(RuntimeInfoKey key) {
        return joCurrent.optString(key.name());
    }

    /**
     * 用于从JSONObject对象中获取指定键的long值
     *
     * @param key 表示要获取的键，它是一个枚举类型，表示JSONObject中的键
     * @return long
     */
    public Long getLong(RuntimeInfoKey key) {
        return joCurrent.optLong(key.name(), 0L);//这是从JSONObject对象中获取指定键的值的代码,0L表示当键不存在时，返回的默认值。
    }

    public void put(RuntimeInfoKey key, Object value) {
        try {
            joCurrent.put(key.name(), value);
            joAll.put(userId, joCurrent);
        } catch (JSONException e) {
            Log.i(TAG, "put err:");
            Log.printStackTrace(TAG, e);
        }
        save();
    }
}
