package pansong291.xposed.quickenergy.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import pansong291.xposed.quickenergy.AntFarm.SendType;
import pansong291.xposed.quickenergy.data.RuntimeInfo;
import pansong291.xposed.quickenergy.hook.ClassMember;
import pansong291.xposed.quickenergy.hook.XposedHook;

public class Config {
    /* application */
    public static final String jn_immediateEffect = "immediateEffect";
    public static final String jn_recordLog = "recordLog";
    public static final String jn_showToast = "showToast";
    public static final String jn_toastOffsetY = "toastOffsetY";
    public static final String jn_stayAwake = "stayAwake";
    public static final String jn_timeoutRestart = "timeoutRestart";
    public static final String jn_stayAwakeType = "stayAwakeType";
    public static final String jn_stayAwakeTarget = "stayAwakeTarget";
    public static final String jn_timeoutType = "timeoutType";
    public static final String jn_startAt7 = "startAt7";
    public static final String jn_enableOnGoing = "enableOnGoing";
    public static final String jn_backupRuntime = "backupRuntime";
    /* forest */
    public static final String jn_collectEnergy = "collectEnergy";
    public static final String jn_ancientTreeCityCodeList = "ancientTreeCityCodeList";
    public static final String jn_collectWateringBubble = "collectWateringBubble";
    public static final String jn_collectProp = "collectProp";
    public static final String jn_ReturnWater33 = "returnWater30";
    public static final String jn_ReturnWater18 = "returnWater20";
    public static final String jn_ReturnWater10 = "returnWater10";
    public static final String jn_helpFriendCollect = "helpFriendCollect";
    public static final String jn_dontCollectList = "dontCollectList";
    public static final String jn_dontHelpCollectList = "dontHelpCollectList";
    public static final String jn_checkInterval = "checkInterval";
    public static final String jn_doubleCard = "doubleCard";
    public static final String jn_doubleCardTime = "doubleCardTime";
    public static final String jn_advanceTime = "advanceTime";
    public static final String jn_collectInterval = "collectInterval";
    public static final String jn_collectTimeout = "collectTimeout";
    public static final String jn_receiveForestTaskAward = "receiveForestTaskAward";
    public static final String jn_waterFriendList = "waterFriendList";
    public static final String jn_waterFriendCount = "waterFriendCount";
    public static final String jn_cooperateWater = "cooperateWater";
    public static final String jn_cooperateWaterList = "cooperateWaterList";
    public static final String jn_ancientTree = "ancientTree";
    public static final String jn_ancientTreeAreaCodeList = "ancientTreeAreaCodeList";
    public static final String jn_reserve = "reserve";
    public static final String jn_reserveList = "reserveList";
    public static final String jn_beach = "beach";
    public static final String jn_beachList = "beachList";
    public static final String jn_energyRain = "energyRain";
    public static final String jn_giveEnergyRainList = "giveEnergyRainList";
    public static final String jn_waitWhenException = "waitWhenException";
    public static final String jn_ancientTreeOnlyWeek = "ancientTreeOnlyWeek";
    /* farm */
    public static final String jn_enableFarm = "enableFarm";
    public static final String jn_rewardFriend = "rewardFriend";
    public static final String jn_sendBackAnimal = "sendBackAnimal";
    public static final String jn_sendType = "sendType";
    public static final String jn_dontSendFriendList = "dontSendFriendList";
    public static final String jn_recallAnimalType = "recallAnimalType";
    public static final String jn_receiveFarmToolReward = "receiveFarmToolReward";
    public static final String jn_recordFarmGame = "recordFarmGame";
    public static final String jn_kitchen = "kitchen";
    public static final String jn_useNewEggTool = "useNewEggTool";
    public static final String jn_harvestProduce = "harvestProduce";
    public static final String jn_donation = "donation";
    public static final String jn_answerQuestion = "answerQuestion";
    public static final String jn_receiveFarmTaskAward = "receiveFarmTaskAward";
    public static final String jn_feedAnimal = "feedAnimal";
    public static final String jn_useAccelerateTool = "useAccelerateTool";
    public static final String jn_feedFriendAnimalList = "feedFriendAnimalList";
    public static final String jn_farmGameTime = "farmGameTime";
    public static final String jn_animalSleepTime = "animalSleepTime";
    public static final String jn_notifyFriend = "notifyFriend";
    public static final String jn_dontNotifyFriendList = "dontNotifyFriendList";
    public static final String jn_whoYouWantGiveTo = "whoYouWantGiveTo";
    public static final String jn_sendFriendCard = "sendFriendCard";
    public static final String jn_acceptGift = "acceptGift";
    public static final String jn_visitFriendList = "visitFriendList";
    public static final String jn_chickenDiary = "chickenDiary";
    public static final String jn_antOrchard = "antOrchard";
    public static final String jn_receiveOrchardTaskAward = "receiveOrchardTaskAward";
    public static final String jn_orchardSpreadManureCount = "orchardSpreadManureCount";
    public static final String jn_antdodoCollect = "antdodoCollect";
    public static final String jn_antOcean = "antOcean";
    public static final String jn_userPatrol = "userPatrol";
    public static final String jn_animalConsumeProp = "animalConsumeProp";
    public static final String jn_collectGiftBox = "collectGiftBox";
    public static final String jn_totalCertCount = "totalCertCount";
    public static final String jn_enableStall = "enableStall";
    public static final String jn_stallAutoOpen = "stallAutoOpen";
    public static final String jn_stallAutoClose = "stallAutoClose";
    public static final String jn_stallAutoTask = "stallAutoTask";
    public static final String jn_stallReceiveAward = "stallReceiveAward";
    public static final String jn_stallOpenType = "stallOpenType";
    public static final String jn_stallOpenList = "stallOpenList";
    public static final String jn_stallWhiteList = "stallWhiteList";
    public static final String jn_stallBlackList = "stallBlackList";
    public static final String jn_stallAllowOpenTime = "stallAllowOpenTime";
    public static final String jn_stallSelfOpenTime = "tallSelfOpenTime";
    public static final String jn_stallDonate = "stallDonate";
    public static final String jn_stallInviteRegister = "stallInviteRegister";
    public static final String jn_stallThrowManure = "stallThrowManure";
    public static final String jn_stallInviteShopList = "stallInviteShopList";
    /* other */
    public static final String jn_receivePoint = "receivePoint";
    public static final String jn_openTreasureBox = "openTreasureBox";
    public static final String jn_receiveCoinAsset = "receiveCoinAsset";
    public static final String jn_donateCharityCoin = "donateCharityCoin";
    public static final String jn_minExchangeCount = "minExchangeCount";
    public static final String jn_latestExchangeTime = "latestExchangeTime";
    public static final String jn_syncStepCount = "syncStepCount";
    public static final String jn_kbSignIn = "kbSignIn";
    public static final String jn_ecoLifeTick = "ecoLifeTick";
    public static final String jn_tiyubiz = "tiyubiz";
    public static final String jn_insBlueBeanExchange = "insBlueBeanExchange";
    public static final String jn_collectSesame = "collectSesame";
    public static final String jn_zcjSignIn = "zcjSignIn";
    public static final String jn_merchantKmdk = "merchantKmdk";
    public static final String jn_greenFinance = "greenFinance";
    public static final String jn_crazyMode = "crazyMode";
    private static final String TAG = Config.class.getCanonicalName();
    public static volatile boolean shouldReload;
    public static volatile boolean hasChanged;
    /* base */
    private static volatile Config config;
    private static int tmpStepCount = -1;
    private static PendingIntent alarm7Pi;
    /* application */
    private boolean immediateEffect;
    private boolean recordLog;
    private boolean showToast;
    private int toastOffsetY;
    private boolean stayAwake;
    private XposedHook.StayAwakeType stayAwakeType;
    private XposedHook.StayAwakeTarget stayAwakeTarget;
    private boolean timeoutRestart;
    private XposedHook.StayAwakeType timeoutType;
    private boolean startAt7;
    private boolean enableOnGoing;
    private boolean backupRuntime;
    /* forest */
    private boolean collectEnergy;
    private int checkInterval;
    private boolean collectWateringBubble;
    private boolean collectProp;
    private boolean limitCollect;
    private int limitCount;
    /**
     * 双击能量卡的疯狂模式
     */
    private boolean crazyMode;
    /**
     * 是否使用双击卡
     */
    private boolean doubleCard;
    /**
     * 双击卡时间列表?
     */
    private List<String> doubleCardTime;
    /**
     * 双击卡限制值
     */
    private int doubleCountLimit;
    private int advanceTime;
    private int collectInterval;
    private int collectTimeout;
    private int returnWater33;
    private int returnWater18;
    private int returnWater10;
    private boolean helpFriendCollect;
    private List<String> dontCollectList;
    private List<String> dontHelpCollectList;
    private boolean receiveForestTaskAward;
    private List<String> waterFriendList;
    private int waterFriendCount;
    private List<Integer> waterCountList;
    private boolean cooperateWater;
    private List<String> cooperateWaterList;
    private List<Integer> cooperateWaterNumList;
    private boolean ancientTree;
    private List<String> ancientTreeCityCodeList;
    private boolean energyRain;
    private boolean reserve;
    private List<String> reserveList;
    private List<Integer> reserveCountList;
    private boolean beach;
    private List<String> beachList;
    private List<Integer> beachCountList;
    private boolean ancientTreeOnlyWeek;
    private List<String> giveEnergyRainList;
    private int waitWhenException;
    private boolean exchangeEnergyDoubleClick;
    private int exchangeEnergyDoubleClickCount;
    private boolean antdodoCollect;
    private boolean antOcean;
    private boolean userPatrol;
    private boolean animalConsumeProp;
    private boolean collectGiftBox;
    private boolean totalCertCount;
    /* farm */
    private boolean enableFarm;
    private boolean rewardFriend;
    private boolean sendBackAnimal;
    private SendType sendType;
    private List<String> dontSendFriendList;
    private RecallAnimalType recallAnimalType;
    private boolean receiveFarmToolReward;
    private boolean recordFarmGame;
    private boolean kitchen;
    private boolean useNewEggTool;
    private boolean harvestProduce;
    private boolean donation;
    private boolean answerQuestion;
    private boolean receiveFarmTaskAward;
    private boolean feedAnimal;
    private boolean useAccelerateTool;
    private List<String> feedFriendAnimalList;
    private List<Integer> feedFriendCountList;
    private List<String> farmGameTime;
    private List<String> animalSleepTime;
    private boolean notifyFriend;
    private List<String> dontNotifyFriendList;
    private List<String> whoYouWantGiveTo;
    private List<String> sendFriendCard;
    private boolean acceptGift;
    private List<String> visitFriendList;
    private List<Integer> visitFriendCountList;
    private boolean chickenDiary;
    private boolean antOrchard;
    private boolean receiveOrchardTaskAward;
    private int orchardSpreadManureCount;
    private boolean enableStall;
    private boolean stallAutoClose;
    private boolean stallAutoOpen;
    private boolean stallAutoTask;
    private boolean stallReceiveAward;
    private boolean stallOpenType;
    private List<String> stallOpenList;
    private List<String> stallWhiteList;
    private List<String> stallBlackList;
    private int stallAllowOpenTime;
    private int stallSelfOpenTime;
    private boolean stallDonate;
    private boolean stallInviteRegister;
    private boolean stallThrowManure;
    private List<String> stallInviteShopList;
    /* other */
    private boolean receivePoint;
    private boolean openTreasureBox;
    private boolean receiveCoinAsset;
    private boolean donateCharityCoin;
    private int minExchangeCount;
    private int latestExchangeTime;
    private int syncStepCount;
    private boolean kbSignIn;
    private boolean ecoLifeTick;
    private boolean tiyubiz;
    private boolean insBlueBeanExchange;
    private boolean collectSesame;
    private boolean zcjSignIn;
    private boolean merchantKmdk;
    private boolean greenFinance;

    /* application */
    public static void setImmediateEffect(boolean b) {
        getConfig().immediateEffect = b;
        hasChanged = true;
    }

    public static boolean immediateEffect() {
        return getConfig().immediateEffect;
    }

    public static void setRecordLog(boolean b) {
        getConfig().recordLog = b;
        hasChanged = true;
    }

    public static boolean recordLog() {
        return getConfig().recordLog;
    }

    public static void setShowToast(boolean b) {
        getConfig().showToast = b;
        hasChanged = true;
    }

    public static boolean showToast() {
        return getConfig().showToast;
    }

    public static void setToastOffsetY(int i) {
        getConfig().toastOffsetY = i;
        hasChanged = true;
    }

    public static int toastOffsetY() {
        return getConfig().toastOffsetY;
    }

    public static void setStayAwake(boolean b) {
        getConfig().stayAwake = b;
        hasChanged = true;
    }

    public static boolean stayAwake() {
        return getConfig().stayAwake;
    }

    public static void setStayAwakeType(int i) {
        getConfig().stayAwakeType = XposedHook.StayAwakeType.values()[i];
        hasChanged = true;
    }

    public static XposedHook.StayAwakeType stayAwakeType() {
        return getConfig().stayAwakeType;
    }

    public static void setStayAwakeTarget(int i) {
        getConfig().stayAwakeTarget = XposedHook.StayAwakeTarget.values()[i];
        hasChanged = true;
    }

    public static XposedHook.StayAwakeTarget stayAwakeTarget() {
        return getConfig().stayAwakeTarget;
    }

    public static void setTimeoutRestart(boolean b) {
        getConfig().timeoutRestart = b;
        hasChanged = true;
    }

    public static boolean timeoutRestart() {
        return getConfig().timeoutRestart;
    }

    public static void setTimeoutType(int i) {
        getConfig().timeoutType = XposedHook.StayAwakeType.values()[i];
        hasChanged = true;
    }

    public static XposedHook.StayAwakeType timeoutType() {
        return getConfig().timeoutType;
    }

    public static void setStartAt7(Context context, boolean b) {
        getConfig().startAt7 = b;
        if (b) {
            setAlarm7(context);
        } else {
            cancelAlarm7(context, true);
        }
        hasChanged = true;
    }

    public static boolean startAt7() {
        return getConfig().startAt7;
    }

    public static void setEnableOnGoing(boolean b) {
        getConfig().enableOnGoing = b;
        hasChanged = true;
    }

    public static boolean enableOnGoing() {
        return getConfig().enableOnGoing;
    }

    public static void setBackupRuntime(boolean b) {
        getConfig().backupRuntime = b;
        hasChanged = true;
    }

    public static boolean backupRuntime() {
        return getConfig().backupRuntime;
    }

    /* forest */
    public static void setCollectEnergy(boolean b) {
        getConfig().collectEnergy = b;
        hasChanged = true;
    }

    public static boolean collectEnergy() {
        return getConfig().collectEnergy;
    }

    public static void setCollectWateringBubble(boolean b) {
        getConfig().collectWateringBubble = b;
        hasChanged = true;
    }

    public static boolean collectWateringBubble() {
        return getConfig().collectWateringBubble;
    }

    public static void setCollectProp(boolean b) {
        getConfig().collectProp = b;
        hasChanged = true;
    }

    public static boolean collectProp() {
        return getConfig().collectProp;
    }

    public static void setCheckInterval(int i) {
        getConfig().checkInterval = i;
        hasChanged = true;
    }

    public static int checkInterval() {
        return getConfig().checkInterval;
    }

    public static void setWaitWhenException(int i) {
        getConfig().waitWhenException = i;
        hasChanged = true;
    }

    public static int waitWhenException() {
        return getConfig().waitWhenException;
    }

    public static boolean isLimitCollect() {
        return getConfig().limitCollect;
    }

    public static void setLimitCollect(boolean limitCollect) {
        getConfig().limitCollect = limitCollect;
        hasChanged = true;
    }

    public static int getLimitCount() {
        return getConfig().limitCount;
    }

    public static void setLimitCount(int limitCount) {
        getConfig().limitCount = limitCount;
        hasChanged = true;
    }

    /**
     * 从设置获取 双击卡是否开启
     *
     * @return doubleCard
     */
    public static boolean doubleCard() {
        return getConfig().doubleCard;
    }

    public static boolean crazyMode() {return getConfig().crazyMode; }

    /**
     * 设置开启双击卡使用
     *
     * @param doubleCard ?
     */
    public static void setDoubleCard(boolean doubleCard) {
        getConfig().doubleCard = doubleCard;
        hasChanged = true;
    }

    public static void setCrazyMode(boolean crazyMode) {
        getConfig().crazyMode = crazyMode;
        hasChanged = true;
    }

    public static String doubleCardTime() {
        return String.join(",", getConfig().doubleCardTime);
    }

    /**
     * 判断是否是使用双击卡的时间
     *
     * @return boolean
     */
    public static boolean isDoubleCardTime() {
        for (String doubleTime : getConfig().doubleCardTime) {
            if (checkInTimeSpan(doubleTime))
                return true;
        }
        return false;
    }

    public static void setDoubleCardTime(String i) {
        getConfig().doubleCardTime = Arrays.asList(i.split(","));
        hasChanged = true;
    }

    /**
     * 获取双击卡次数限制值
     *
     * @return int
     */
    public static int getDoubleCountLimit() {
        return getConfig().doubleCountLimit;
    }

    public static void setDoubleCountLimit(int doubleCountLimit) {
        getConfig().doubleCountLimit = doubleCountLimit;
        hasChanged = true;
    }

    public static void setAdvanceTime(int i) {
        getConfig().advanceTime = i;
        hasChanged = true;
    }

    public static int advanceTime() {
        return getConfig().advanceTime;
    }

    public static void setCollectInterval(int i) {
        getConfig().collectInterval = i;
        hasChanged = true;
    }

    public static int collectInterval() {
        return getConfig().collectInterval;
    }

    public static void setCollectTimeout(int i) {
        getConfig().collectTimeout = i;
        hasChanged = true;
    }

    public static int collectTimeout() {
        return getConfig().collectTimeout;
    }

    public static void setReturnWater33(int i) {
        getConfig().returnWater33 = i;
        hasChanged = true;
    }

    public static int returnWater33() {
        return getConfig().returnWater33;
    }

    public static void setReturnWater18(int i) {
        getConfig().returnWater18 = i;
        hasChanged = true;
    }

    public static int returnWater18() {
        return getConfig().returnWater18;
    }

    public static void setReturnWater10(int i) {
        getConfig().returnWater10 = i;
        hasChanged = true;
    }

    public static int returnWater10() {
        return getConfig().returnWater10;
    }

    public static void setHelpFriendCollect(boolean b) {
        getConfig().helpFriendCollect = b;
        hasChanged = true;
    }

    public static boolean helpFriendCollect() {
        return getConfig().helpFriendCollect;
    }

    public static List<String> getDontCollectList() {
        return getConfig().dontCollectList;
    }

    public static List<String> getDontHelpCollectList() {
        return getConfig().dontHelpCollectList;
    }

    public static void setReceiveForestTaskAward(boolean b) {
        getConfig().receiveForestTaskAward = b;
        hasChanged = true;
    }

    public static boolean receiveForestTaskAward() {
        return getConfig().receiveForestTaskAward;
    }

    public static List<String> getWaterFriendList() {
        return getConfig().waterFriendList;
    }

    public static List<Integer> getWaterCountList() {
        return getConfig().waterCountList;
    }

    public static void setWaterFriendCount(int i) {
        getConfig().waterFriendCount = i;
        hasChanged = true;
    }

    public static int waterFriendCount() {
        return getConfig().waterFriendCount;
    }

    public static void setCooperateWater(boolean b) {
        getConfig().cooperateWater = b;
        hasChanged = true;
    }

    public static boolean cooperateWater() {
        return getConfig().cooperateWater;
    }

    public static List<String> getCooperateWaterList() {
        return getConfig().cooperateWaterList;
    }

    public static List<Integer> getcooperateWaterNumList() {
        return getConfig().cooperateWaterNumList;
    }

    public static void setAncientTree(boolean b) {
        getConfig().ancientTree = b;
        hasChanged = true;
    }

    public static boolean ancientTree() {
        return getConfig().ancientTree;
    }

    public static List<String> getAncientTreeCityCodeList() {
        return getConfig().ancientTreeCityCodeList;
    }

    public static void setReserve(boolean b) {
        getConfig().reserve = b;
        hasChanged = true;
    }

    public static boolean reserve() {
        return getConfig().reserve;
    }

    public static List<String> getReserveList() {
        return getConfig().reserveList;
    }

    public static List<Integer> getReserveCountList() {
        return getConfig().reserveCountList;
    }

    public static void setBeach(boolean b) {
        getConfig().beach = b;
        hasChanged = true;
    }

    public static boolean beach() {
        return getConfig().beach;
    }

    public static List<String> getBeachList() {
        return getConfig().beachList;
    }

    public static List<Integer> getBeachCountList() {
        return getConfig().beachCountList;
    }

    public static void setEnergyRain(boolean b) {
        getConfig().energyRain = b;
        hasChanged = true;
    }

    public static List<String> getGiveEnergyRainList() {
        return getConfig().giveEnergyRainList;
    }

    public static boolean energyRain() {
        return getConfig().energyRain;
    }

    public static boolean ExchangeEnergyDoubleClick() {
        return getConfig().exchangeEnergyDoubleClick;
    }

    public static void setExchangeEnergyDoubleClick(boolean b) {
        getConfig().exchangeEnergyDoubleClick = b;
        hasChanged = true;
    }

    public static int getExchangeEnergyDoubleClickCount() {
        return getConfig().exchangeEnergyDoubleClickCount;
    }

    public static void setExchangeEnergyDoubleClickCount(int i) {
        getConfig().exchangeEnergyDoubleClickCount = i;
        hasChanged = true;
    }

    public static void setAncientTreeOnlyWeek(boolean b) {
        getConfig().ancientTreeOnlyWeek = b;
        hasChanged = true;
    }

    public static boolean ancientTreeOnlyWeek() {
        return getConfig().ancientTreeOnlyWeek;
    }

    public static boolean isAncientTreeWeek() {
        if (!ancientTreeOnlyWeek()) {
            return true;
        }
        SimpleDateFormat sdf_week = new SimpleDateFormat("EEEE", Locale.getDefault());
        String week = sdf_week.format(new Date());
        return "星期一".equals(week) || "星期三".equals(week) || "星期五".equals(week);
    }

    public static void setAntdodoCollect(boolean b) {
        getConfig().antdodoCollect = b;
        hasChanged = true;
    }

    public static boolean antdodoCollect() {
        return getConfig().antdodoCollect;
    }

    public static void setAntOcean(boolean b) {
        getConfig().antOcean = b;
        hasChanged = true;
    }

    public static boolean antOcean() {
        return getConfig().antOcean;
    }

    public static void setUserPatrol(boolean b) {
        getConfig().userPatrol = b;
        hasChanged = true;
    }

    public static boolean userPatrol() {
        return getConfig().userPatrol;
    }

    public static void setAnimalConsumeProp(boolean b) {
        getConfig().animalConsumeProp = b;
        hasChanged = true;
    }

    public static boolean animalConsumeProp() {
        return getConfig().animalConsumeProp;
    }

    public static void setCollectGiftBox(boolean b) {
        getConfig().collectGiftBox = b;
        hasChanged = true;
    }

    public static boolean collectGiftBox() {
        return getConfig().collectGiftBox;
    }

    public static void setTotalCertCount(boolean b) {
        getConfig().totalCertCount = b;
        hasChanged = true;
    }

    public static boolean totalCertCount() {
        return getConfig().totalCertCount;
    }

    /* farm */
    public static void setEnableFarm(boolean b) {
        getConfig().enableFarm = b;
        hasChanged = true;
    }

    public static boolean enableFarm() {
        return getConfig().enableFarm;
    }

    public static void setRewardFriend(boolean b) {
        getConfig().rewardFriend = b;
        hasChanged = true;
    }

    public static boolean rewardFriend() {
        return getConfig().rewardFriend;
    }

    public static void setSendBackAnimal(boolean b) {
        getConfig().sendBackAnimal = b;
        hasChanged = true;
    }

    public static boolean sendBackAnimal() {
        return getConfig().sendBackAnimal;
    }

    public static void setSendType(int i) {
        getConfig().sendType = SendType.values()[i];
        hasChanged = true;
    }

    public static SendType sendType() {
        return getConfig().sendType;
    }

    public static List<String> getDontSendFriendList() {
        return getConfig().dontSendFriendList;
    }

    public static void setRecallAnimalType(int i) {
        getConfig().recallAnimalType = RecallAnimalType.values()[i];
        hasChanged = true;
    }

    public static RecallAnimalType recallAnimalType() {
        return getConfig().recallAnimalType;
    }

    public static void setReceiveFarmToolReward(boolean b) {
        getConfig().receiveFarmToolReward = b;
        hasChanged = true;
    }

    public static boolean receiveFarmToolReward() {
        return getConfig().receiveFarmToolReward;
    }

    public static void setRecordFarmGame(boolean b) {
        getConfig().recordFarmGame = b;
        hasChanged = true;
    }

    public static boolean recordFarmGame() {
        return getConfig().recordFarmGame;
    }

    public static void setKitchen(boolean b) {
        getConfig().kitchen = b;
        hasChanged = true;
    }

    public static boolean kitchen() {
        return getConfig().kitchen;
    }

    public static void setUseNewEggTool(boolean b) {
        getConfig().useNewEggTool = b;
        hasChanged = true;
    }

    public static boolean useNewEggTool() {
        return getConfig().useNewEggTool;
    }

    public static void setHarvestProduce(boolean b) {
        getConfig().harvestProduce = b;
        hasChanged = true;
    }

    public static boolean harvestProduce() {
        return getConfig().harvestProduce;
    }

    public static void setDonation(boolean b) {
        getConfig().donation = b;
        hasChanged = true;
    }

    public static boolean donation() {
        return getConfig().donation;
    }

    public static void setAnswerQuestion(boolean b) {
        getConfig().answerQuestion = b;
        hasChanged = true;
    }

    public static boolean answerQuestion() {
        return getConfig().answerQuestion;
    }

    public static void setReceiveFarmTaskAward(boolean b) {
        getConfig().receiveFarmTaskAward = b;
        hasChanged = true;
    }

    public static boolean receiveFarmTaskAward() {
        return getConfig().receiveFarmTaskAward;
    }

    public static void setFeedAnimal(boolean b) {
        getConfig().feedAnimal = b;
        hasChanged = true;
    }

    public static boolean feedAnimal() {
        return getConfig().feedAnimal;
    }

    public static void setUseAccelerateTool(boolean b) {
        getConfig().useAccelerateTool = b;
        hasChanged = true;
    }

    public static boolean useAccelerateTool() {
        return getConfig().useAccelerateTool;
    }

    public static List<String> getFeedFriendAnimalList() {
        return getConfig().feedFriendAnimalList;
    }

    public static List<Integer> getFeedFriendCountList() {
        return getConfig().feedFriendCountList;
    }

    public static String farmGameTime() {
        return String.join(",", getConfig().farmGameTime);
    }

    /**
     * 是否是农场游戏时间
     *
     * @return boolean
     */
    public static boolean isFarmGameTime() {
        for (String doubleTime : getConfig().farmGameTime) {
            if (checkInTimeSpan(doubleTime))
                return true;
        }
        return false;
    }

    public static void setFarmGameTime(String i) {
        getConfig().farmGameTime = Arrays.asList(i.split(","));
        hasChanged = true;
    }

    public static String animalSleepTime() {
        return String.join(",", getConfig().animalSleepTime);
    }

    /**
     * 是否是小鸡休息时间
     *
     * @return boolean
     */
    public static boolean isAnimalSleepTime() {
        for (String doubleTime : getConfig().animalSleepTime) {
            if (checkInTimeSpan(doubleTime))
                return true;
        }
        return false;
    }

    public static void setAnimalSleepTime(String i) {
        getConfig().animalSleepTime = Arrays.asList(i.split(","));
        hasChanged = true;
    }

    /**
     * 检查给定的时间字符串是否在指定时间范围内
     *
     * @param timeStr 要检查的时间字符串，格式为 "min-max"，或者 "HH:mm"
     * @return 如果给定的时间字符串在指定时间范围内，则返回true，否则返回false
     */
    private static boolean checkInTimeSpan(String timeStr) {
        if (timeStr.contains("-")) {
            String[] arr = timeStr.split("-");
            String min = arr[0];
            String max = arr[1];
            String now = TimeUtil.getTimeStr();
            return min.compareTo(now) <= 0 && max.compareTo(now) >= 0;
        } else {
            return TimeUtil.checkInTime(-getConfig().checkInterval, timeStr);
        }
    }

    public static void setNotifyFriend(boolean b) {
        getConfig().notifyFriend = b;
        hasChanged = true;
    }

    public static boolean notifyFriend() {
        return getConfig().notifyFriend;
    }

    public static List<String> getDontNotifyFriendList() {
        return getConfig().dontNotifyFriendList;
    }

    public static List<String> whoYouWantGiveTo() {
        return getConfig().whoYouWantGiveTo;
    }

    public static List<String> sendFriendCard() {
        return getConfig().sendFriendCard;
    }

    public static void setAcceptGift(boolean b) {
        getConfig().acceptGift = b;
        hasChanged = true;
    }

    public static boolean acceptGift() {
        return getConfig().acceptGift;
    }

    public static List<String> getVisitFriendList() {
        return getConfig().visitFriendList;
    }

    public static List<Integer> getVisitFriendCountList() {
        return getConfig().visitFriendCountList;
    }

    public static void setChickenDiary(boolean b) {
        getConfig().chickenDiary = b;
        hasChanged = true;
    }

    public static boolean chickenDiary() {
        return getConfig().chickenDiary;
    }

    public static void setAntOrchard(boolean b) {
        getConfig().antOrchard = b;
        hasChanged = true;
    }

    public static boolean antOrchard() {
        return getConfig().antOrchard;
    }

    public static void setReceiveOrchardTaskAward(boolean b) {
        getConfig().receiveOrchardTaskAward = b;
        hasChanged = true;
    }

    public static boolean receiveOrchardTaskAward() {
        return getConfig().receiveOrchardTaskAward;
    }

    public static int getOrchardSpreadManureCount() {
        return getConfig().orchardSpreadManureCount;
    }

    public static void setOrchardSpreadManureCount(int i) {
        getConfig().orchardSpreadManureCount = i;
        hasChanged = true;
    }

    public static void setEnableStall(boolean b) {
        getConfig().enableStall = b;
        hasChanged = true;
    }

    public static boolean enableStall() {
        return getConfig().enableStall;
    }

    public static void setStallAutoClose(boolean b) {
        getConfig().stallAutoClose = b;
        hasChanged = true;
    }

    public static boolean stallAutoClose() {
        return getConfig().stallAutoClose;
    }

    public static void setStallAutoOpen(boolean b) {
        getConfig().stallAutoOpen = b;
        hasChanged = true;
    }

    public static boolean stallAutoOpen() {
        return getConfig().stallAutoOpen;
    }

    public static void setStallAutoTask(boolean b) {
        getConfig().stallAutoTask = b;
        hasChanged = true;
    }

    public static boolean stallAutoTask() {
        return getConfig().stallAutoTask;
    }

    public static void setStallReceiveAward(boolean b) {
        getConfig().stallReceiveAward = b;
        hasChanged = true;
    }

    public static boolean stallReceiveAward() {
        return getConfig().stallReceiveAward;
    }

    public static void setStallOpenType(boolean b) {
        getConfig().stallOpenType = b;
        hasChanged = true;
    }

    public static boolean stallOpenType() {
        return getConfig().stallOpenType;
    }

    public static List<String> stallOpenList() {
        return getConfig().stallOpenList;
    }

    public static List<String> stallWhiteList() {
        return getConfig().stallWhiteList;
    }

    public static List<String> stallBlackList() {
        return getConfig().stallBlackList;
    }

    public static void setStallAllowOpenTime(int b) {
        getConfig().stallAllowOpenTime = b;
        hasChanged = true;
    }

    public static int stallAllowOpenTime() {
        return getConfig().stallAllowOpenTime;
    }

    public static void setStallSelfOpenTime(int b) {
        getConfig().stallSelfOpenTime = b;
        hasChanged = true;
    }

    public static int stallSelfOpenTime() {
        return getConfig().stallSelfOpenTime;
    }

    public static void setStallDonate(boolean b) {
        getConfig().stallDonate = b;
        hasChanged = true;
    }

    public static boolean stallDonate() {
        return getConfig().stallDonate;
    }

    public static void setStallInviteRegister(boolean b) {
        getConfig().stallInviteRegister = b;
        hasChanged = true;
    }

    public static boolean stallInviteRegister() {
        return getConfig().stallInviteRegister;
    }

    public static List<String> stallInviteShopList() {
        return getConfig().stallInviteShopList;
    }

    public static void setStallThrowManure(boolean b) {
        getConfig().stallThrowManure = b;
        hasChanged = true;
    }

    public static boolean stallThrowManure() {
        return getConfig().stallThrowManure;
    }

    /* other */
    public static void setReceivePoint(boolean b) {
        getConfig().receivePoint = b;
        hasChanged = true;
    }

    public static boolean receivePoint() {
        return getConfig().receivePoint;
    }

    public static void setOpenTreasureBox(boolean b) {
        getConfig().openTreasureBox = b;
        hasChanged = true;
    }

    public static boolean openTreasureBox() {
        return getConfig().openTreasureBox;
    }

    public static void setReceiveCoinAsset(boolean b) {
        getConfig().receiveCoinAsset = b;
        hasChanged = true;
    }

    public static boolean receiveCoinAsset() {
        return getConfig().receiveCoinAsset;
    }

    public static void setDonateCharityCoin(boolean b) {
        getConfig().donateCharityCoin = b;
        hasChanged = true;
    }

    public static boolean donateCharityCoin() {
        return getConfig().donateCharityCoin;
    }

    public static void setMinExchangeCount(int i) {
        getConfig().minExchangeCount = i;
        hasChanged = true;
    }

    public static int minExchangeCount() {
        return getConfig().minExchangeCount;
    }

    public static void setLatestExchangeTime(int i) {
        getConfig().latestExchangeTime = i;
        hasChanged = true;
    }

    public static int latestExchangeTime() {
        return getConfig().latestExchangeTime;
    }

    public static void setSyncStepCount(int i) {
        getConfig().syncStepCount = i;
        hasChanged = true;
    }

    public static int syncStepCount() {
        return getConfig().syncStepCount;
    }

    public static int tmpStepCount() {
        if (tmpStepCount >= 0) {
            return tmpStepCount;
        }
        tmpStepCount = Config.syncStepCount();
        if (tmpStepCount > 0) {
            tmpStepCount = RandomUtils.nextInt(tmpStepCount, tmpStepCount + 2000);
            if (tmpStepCount > 100000) {
                tmpStepCount = 100000;
            }
        }
        return tmpStepCount;
    }

    public static void setKbSginIn(boolean b) {
        getConfig().kbSignIn = b;
        hasChanged = true;
    }

    public static boolean kbSginIn() {
        return getConfig().kbSignIn;
    }

    public static void setEcoLifeTick(boolean b) {
        getConfig().ecoLifeTick = b;
        hasChanged = true;
    }

    public static boolean ecoLifeTick() {
        return getConfig().ecoLifeTick;
    }

    public static void setTiyubiz(boolean b) {
        getConfig().tiyubiz = b;
        hasChanged = true;
    }

    public static boolean tiyubiz() {
        return getConfig().tiyubiz;
    }

    public static void setInsBlueBeanExchange(boolean b) {
        getConfig().insBlueBeanExchange = b;
        hasChanged = true;
    }

    public static boolean insBlueBeanExchange() {
        return getConfig().insBlueBeanExchange;
    }

    public static void setCollectSesame(boolean b) {
        getConfig().collectSesame = b;
        hasChanged = true;
    }

    public static boolean collectSesame() {
        return getConfig().collectSesame;
    }

    public static void setZcjSignIn(boolean b) {
        getConfig().zcjSignIn = b;
        hasChanged = true;
    }

    public static boolean zcjSignIn() {
        return getConfig().zcjSignIn;
    }

    public static void setMerchantKmdk(boolean b) {
        getConfig().merchantKmdk = b;
        hasChanged = true;
    }

    public static boolean merchantKmdk() {
        return getConfig().merchantKmdk;
    }

    public static void setGreenFinance(boolean b) {
        getConfig().greenFinance = b;
        hasChanged = true;
    }

    public static boolean greenFinance() {
        return getConfig().greenFinance;
    }

    /* base */
    private static synchronized Config getConfig() {
        if (config == null || shouldReload && config.immediateEffect) {
            shouldReload = false;
            Log.i(TAG, "get config from" + RuntimeInfo.process);
            String confJson = null;
            if (FileUtils.getConfigFile(FriendIdMap.currentUid).exists())
                confJson = FileUtils.readFromFile(FileUtils.getConfigFile(FriendIdMap.currentUid));
            config = json2Config(confJson);
        }
        return config;
    }

    /**
     * 配置初始化
     */
    public static Config defInit() {
        Config cfg = new Config();

        cfg.immediateEffect = true;
        cfg.recordLog = true;
        cfg.showToast = true;
        cfg.toastOffsetY = 0;
        cfg.stayAwake = true;
        cfg.stayAwakeType = XposedHook.StayAwakeType.BROADCAST;
        cfg.stayAwakeTarget = XposedHook.StayAwakeTarget.SERVICE;
        cfg.timeoutRestart = true;
        cfg.timeoutType = XposedHook.StayAwakeType.ALARM;
        cfg.startAt7 = false;
        cfg.enableOnGoing = false;
        cfg.backupRuntime = false;
        cfg.collectEnergy = false;
        cfg.collectWateringBubble = true;
        cfg.collectProp = true;
        cfg.checkInterval = 720_000;
        cfg.waitWhenException = 60 * 60 * 1000;
        cfg.limitCollect = true;
        cfg.limitCount = 50; //
        cfg.doubleCard = false;
        cfg.doubleCardTime = new ArrayList<>();
        cfg.doubleCardTime.add("0700-0730");//双击卡使用时间-7点-7.半
        cfg.crazyMode = false;
        cfg.doubleCountLimit = 6;//双击卡最大次数限制
        cfg.advanceTime = 0;
        cfg.collectInterval = 100;
        cfg.collectTimeout = 2_000;
        cfg.returnWater33 = 0;
        cfg.returnWater18 = 0;
        cfg.returnWater10 = 0;
        cfg.helpFriendCollect = true;
        if (cfg.dontCollectList == null)
            cfg.dontCollectList = new ArrayList<>();
        if (cfg.dontHelpCollectList == null)
            cfg.dontHelpCollectList = new ArrayList<>();
        cfg.receiveForestTaskAward = true;
        if (cfg.waterFriendList == null)
            cfg.waterFriendList = new ArrayList<>();
        if (cfg.waterCountList == null)
            cfg.waterCountList = new ArrayList<>();
        cfg.waterFriendCount = 66;
        cfg.cooperateWater = true;
        if (cfg.cooperateWaterList == null)
            cfg.cooperateWaterList = new ArrayList<>();
        if (cfg.cooperateWaterNumList == null)
            cfg.cooperateWaterNumList = new ArrayList<>();
        cfg.ancientTree = true;
        cfg.reserve = true;
        if (cfg.reserveList == null)
            cfg.reserveList = new ArrayList<>();
        if (cfg.reserveCountList == null)
            cfg.reserveCountList = new ArrayList<>();
        cfg.beach = true;
        if (cfg.beachList == null)
            cfg.beachList = new ArrayList<>();
        if (cfg.beachCountList == null)
            cfg.beachCountList = new ArrayList<>();
        cfg.energyRain = true;
        if (cfg.giveEnergyRainList == null)
            cfg.giveEnergyRainList = new ArrayList<>();
        cfg.exchangeEnergyDoubleClick = false;
        cfg.exchangeEnergyDoubleClickCount = 6;
        cfg.ancientTreeOnlyWeek = true;
        cfg.antdodoCollect = true;
        cfg.antOcean = true;
        cfg.userPatrol = true;
        cfg.animalConsumeProp = true;
        cfg.collectGiftBox = true;
        cfg.totalCertCount = false;

        cfg.enableFarm = true;
        cfg.rewardFriend = true;
        cfg.sendBackAnimal = true;
        cfg.sendType = SendType.HIT;
        if (cfg.dontSendFriendList == null)
            cfg.dontSendFriendList = new ArrayList<>();
        cfg.recallAnimalType = RecallAnimalType.ALWAYS;
        cfg.receiveFarmToolReward = true;
        cfg.recordFarmGame = true;
        cfg.kitchen = true;
        cfg.useNewEggTool = true;
        cfg.harvestProduce = true;
        cfg.donation = true;
        cfg.answerQuestion = true;
        cfg.receiveFarmTaskAward = true;
        cfg.feedAnimal = true;
        cfg.useAccelerateTool = true;
        if (cfg.feedFriendAnimalList == null)
            cfg.feedFriendAnimalList = new ArrayList<>();
        if (cfg.feedFriendCountList == null)
            cfg.feedFriendCountList = new ArrayList<>();
        cfg.farmGameTime = new ArrayList<>();
        cfg.farmGameTime.add("2200-2400");
        cfg.animalSleepTime = new ArrayList<>();
        cfg.animalSleepTime.add("2300-2400");
        cfg.animalSleepTime.add("0000-0559");
        cfg.notifyFriend = false;
        if (cfg.dontNotifyFriendList == null)
            cfg.dontNotifyFriendList = new ArrayList<>();
        cfg.whoYouWantGiveTo = new ArrayList<>();
        cfg.sendFriendCard = new ArrayList<>();
        cfg.acceptGift = true;
        if (cfg.visitFriendList == null)
            cfg.visitFriendList = new ArrayList<>();
        if (cfg.visitFriendCountList == null)
            cfg.visitFriendCountList = new ArrayList<>();
        cfg.chickenDiary = true;
        cfg.antOrchard = true;
        cfg.receiveOrchardTaskAward = true;
        cfg.orchardSpreadManureCount = 0;

        cfg.enableStall = false;
        cfg.stallAutoClose = false;
        cfg.stallAutoOpen = false;
        cfg.stallAutoTask = true;
        cfg.stallReceiveAward = false;
        cfg.stallOpenType = true;
        cfg.stallOpenList = new ArrayList<>();
        cfg.stallWhiteList = new ArrayList<>();
        cfg.stallBlackList = new ArrayList<>();
        cfg.stallAllowOpenTime = 121;
        cfg.stallSelfOpenTime = 120;
        cfg.stallDonate = false;
        cfg.stallInviteRegister = false;
        cfg.stallThrowManure = false;
        cfg.stallInviteShopList = new ArrayList<>();

        cfg.receivePoint = true;
        cfg.openTreasureBox = true;
        cfg.receiveCoinAsset = true;
        cfg.donateCharityCoin = false;
        cfg.kbSignIn = true;
        cfg.syncStepCount = 22000;
        cfg.ecoLifeTick = true;
        cfg.tiyubiz = true;
        cfg.insBlueBeanExchange = true;
        cfg.collectSesame = false;
        cfg.zcjSignIn = false;
        cfg.merchantKmdk = false;
        cfg.greenFinance = false;
        return cfg;
    }

    public static boolean saveConfigFile() {
        String json = config2Json(config);
        Log.infoChanged("保存 config.json", json);
        return FileUtils.write2File(json, FileUtils.getConfigFile());
    }

    public static Config json2Config(String json) {
        Config cfg;
        try {
            JSONObject jsonObj = new JSONObject(json);
            JSONArray ja, jaa;
            cfg = new Config();

            cfg.immediateEffect = jsonObj.optBoolean(jn_immediateEffect, true);
            //Log.i(TAG, jn_immediateEffect + ":" + cfg.immediateEffect);

            cfg.recordLog = jsonObj.optBoolean(jn_recordLog, true);
            //Log.i(TAG, jn_recordLog + ":" + cfg.recordLog);

            cfg.showToast = jsonObj.optBoolean(jn_showToast, true);
            //Log.i(TAG, jn_showToast + ":" + cfg.showToast);

            cfg.toastOffsetY = jsonObj.optInt(jn_toastOffsetY, 0);
            //Log.i(TAG, jn_toastOffsetY + ":" + cfg.toastOffsetY);

            cfg.stayAwake = jsonObj.optBoolean(jn_stayAwake, true);
            //Log.i(TAG, jn_stayAwake + ":" + cfg.stayAwake);

            cfg.stayAwakeType = XposedHook.StayAwakeType
                    .valueOf(jsonObj.optString(jn_stayAwakeType, XposedHook.StayAwakeType.BROADCAST.name()));
            //Log.i(TAG, jn_stayAwakeType + ":" + cfg.stayAwakeType);

            cfg.stayAwakeTarget = XposedHook.StayAwakeTarget
                    .valueOf(jsonObj.optString(jn_stayAwakeTarget, XposedHook.StayAwakeTarget.SERVICE.name()));
            //Log.i(TAG, jn_stayAwakeTarget + ":" + cfg.stayAwakeTarget);

            cfg.timeoutRestart = jsonObj.optBoolean(jn_timeoutRestart, true);
            //Log.i(TAG, jn_timeoutRestart + ":" + cfg.timeoutRestart);

            cfg.timeoutType = XposedHook.StayAwakeType
                    .valueOf(jsonObj.optString(jn_timeoutType, XposedHook.StayAwakeType.BROADCAST.name()));
            //Log.i(TAG, jn_timeoutType + ":" + cfg.timeoutType);

            cfg.startAt7 = jsonObj.optBoolean(jn_startAt7, false);
            //Log.i(TAG, jn_startAt7 + ":" + cfg.startAt7);

            cfg.enableOnGoing = jsonObj.optBoolean(jn_enableOnGoing, false);
            //Log.i(TAG, jn_enableOnGoing + ":" + cfg.enableOnGoing);

            cfg.backupRuntime = jsonObj.optBoolean(jn_backupRuntime, false);
            //Log.i(TAG, jn_backupRuntime + ":" + cfg.backupRuntime);

            /* forest */
            cfg.collectEnergy = jsonObj.optBoolean(jn_collectEnergy, false);
            //Log.i(TAG, jn_collectEnergy + ":" + cfg.collectEnergy);

            cfg.collectWateringBubble = jsonObj.optBoolean(jn_collectWateringBubble, true);
            //Log.i(TAG, jn_collectWateringBubble + ":" + cfg.collectWateringBubble);

            cfg.collectProp = jsonObj.optBoolean(jn_collectProp, true);
            //Log.i(TAG, jn_collectProp + ":" + cfg.collectProp);

            cfg.checkInterval = jsonObj.optInt(jn_checkInterval, 720_000);
            //Log.i(TAG, jn_checkInterval + ":" + cfg.checkInterval);

            cfg.waitWhenException = jsonObj.optInt(jn_waitWhenException, 60 * 60 * 1000);
            //Log.i(TAG, jn_waitWhenException + ":" + cfg.waitWhenException);

            cfg.limitCollect = jsonObj.optBoolean("limitCollect", true);
            Log.i(TAG, "limitCollect" + ":" + cfg.limitCollect);

            cfg.limitCount = jsonObj.optInt("limitCount", 50);
            Log.i(TAG, "limitCount" + ":" + cfg.limitCount);

            cfg.crazyMode = jsonObj.optBoolean(jn_crazyMode, false);
            Log.i(TAG, jn_crazyMode + ":" + cfg.crazyMode);

            cfg.doubleCard = jsonObj.optBoolean(jn_doubleCard, false);
            Log.i(TAG, jn_doubleCard + ":" + cfg.doubleCard);

            cfg.doubleCardTime = Arrays.asList(jsonObj.optString(jn_doubleCardTime, "0700-0730").split(","));

            cfg.doubleCountLimit = jsonObj.optInt("doubleCountLimit", 6);
            Log.i(TAG, "doubleCountLimit" + ":" + cfg.doubleCountLimit);

            cfg.advanceTime = jsonObj.optInt(jn_advanceTime, 0);
            //Log.i(TAG, jn_advanceTime + ":" + cfg.advanceTime);

            cfg.collectInterval = jsonObj.optInt(jn_collectInterval, 100);
            //Log.i(TAG, jn_collectInterval + ":" + cfg.collectInterval);

            cfg.collectTimeout = jsonObj.optInt(jn_collectTimeout, 2_000);
            //Log.i(TAG, jn_collectTimeout + ":" + cfg.collectTimeout);

            cfg.returnWater33 = jsonObj.optInt(jn_ReturnWater33);
            //Log.i(TAG, jn_ReturnWater33 + ":" + cfg.returnWater33);

            cfg.returnWater18 = jsonObj.optInt(jn_ReturnWater18);
            //Log.i(TAG, jn_ReturnWater18 + ":" + cfg.returnWater18);

            cfg.returnWater10 = jsonObj.optInt(jn_ReturnWater10);
            //Log.i(TAG, jn_ReturnWater10 + ":" + cfg.returnWater10);

            cfg.helpFriendCollect = jsonObj.optBoolean(jn_helpFriendCollect, true);
            //Log.i(TAG, jn_helpFriendCollect + ":" + cfg.helpFriendCollect);

            cfg.dontCollectList = new ArrayList<>();
            if (jsonObj.has(jn_dontCollectList)) {
                ja = jsonObj.getJSONArray(jn_dontCollectList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.dontCollectList.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_dontCollectList + ":" + String.join(",", cfg.dontCollectList));

            cfg.dontHelpCollectList = new ArrayList<>();
            if (jsonObj.has(jn_dontHelpCollectList)) {
                ja = jsonObj.getJSONArray(jn_dontHelpCollectList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.dontHelpCollectList.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_dontHelpCollectList + ":" + String.join(",", cfg.dontHelpCollectList));

            cfg.receiveForestTaskAward = jsonObj.optBoolean(jn_receiveForestTaskAward, true);
            //Log.i(TAG, jn_receiveForestTaskAward + ":" + cfg.receiveForestTaskAward);

            cfg.waterFriendList = new ArrayList<>();
            cfg.waterCountList = new ArrayList<>();
            if (jsonObj.has(jn_waterFriendList)) {
                ja = jsonObj.getJSONArray(jn_waterFriendList);
                for (int i = 0; i < ja.length(); i++) {
                    if (ja.get(i) instanceof JSONArray) {
                        jaa = ja.getJSONArray(i);
                        cfg.waterFriendList.add(jaa.getString(0));
                        cfg.waterCountList.add(jaa.getInt(1));
                    } else {
                        cfg.waterFriendList.add(ja.getString(i));
                        cfg.waterCountList.add(3);
                    }
                }
            }
            //Log.i(TAG, jn_waterFriendList + ":" + String.join(",", cfg.waterFriendList));

            cfg.waterFriendCount = jsonObj.optInt(jn_waterFriendCount, 66);
            //Log.i(TAG, jn_waterFriendCount + ":" + cfg.waterFriendCount);

            cfg.cooperateWater = jsonObj.optBoolean(jn_cooperateWater, true);
            //Log.i(TAG, jn_cooperateWater + ":" + cfg.cooperateWater);

            cfg.cooperateWaterList = new ArrayList<>();
            cfg.cooperateWaterNumList = new ArrayList<>();
            if (jsonObj.has(jn_cooperateWaterList)) {
                ja = jsonObj.getJSONArray(jn_cooperateWaterList);
                for (int i = 0; i < ja.length(); i++) {
                    jaa = ja.getJSONArray(i);
                    cfg.cooperateWaterList.add(jaa.getString(0));
                    cfg.cooperateWaterNumList.add(jaa.getInt(1));
                }
            }
            //Log.i(TAG, jn_cooperateWaterList + ":" + String.join(",", cfg.cooperateWaterList));

            cfg.ancientTree = jsonObj.optBoolean(jn_ancientTree, true);
            //Log.i(TAG, jn_ancientTree + ":" + cfg.ancientTree);

            cfg.ancientTreeCityCodeList = new ArrayList<>();
            if (jsonObj.has(jn_ancientTreeAreaCodeList)) {
                ja = jsonObj.getJSONArray(jn_ancientTreeAreaCodeList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.ancientTreeCityCodeList.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_ancientTreeAreaCodeList + ":" + String.join(",", cfg.ancientTreeCityCodeList));

            cfg.energyRain = jsonObj.optBoolean(jn_energyRain, true);
            //Log.i(TAG, jn_energyRain + ":" + cfg.energyRain);

            cfg.giveEnergyRainList = new ArrayList<>();
            if (jsonObj.has(jn_giveEnergyRainList)) {
                ja = jsonObj.getJSONArray(jn_giveEnergyRainList);
                for (int i = 0; i < ja.length(); i++) {
                    jaa = ja.getJSONArray(i);
                    cfg.giveEnergyRainList.add(jaa.getString(0));
                }
            }
            //Log.i(TAG, jn_giveEnergyRainList + ":" + String.join(",", cfg.giveEnergyRainList));

            cfg.reserve = jsonObj.optBoolean(jn_reserve, true);
            //Log.i(TAG, jn_reserve + ":" + cfg.reserve);

            cfg.reserveList = new ArrayList<>();
            cfg.reserveCountList = new ArrayList<>();
            if (jsonObj.has(jn_reserveList)) {
                ja = jsonObj.getJSONArray(jn_reserveList);
                for (int i = 0; i < ja.length(); i++) {
                    if (ja.get(i) instanceof JSONArray) {
                        jaa = ja.getJSONArray(i);
                        cfg.reserveList.add(jaa.getString(0));
                        cfg.reserveCountList.add(jaa.getInt(1));
                    } else {
                        cfg.reserveList.add(ja.getString(i));
                        cfg.reserveCountList.add(2);
                    }
                }
            }
            //Log.i(TAG, jn_reserveList + ":" + String.join(",", cfg.reserveList));

            cfg.beach = jsonObj.optBoolean(jn_beach, true);
            //Log.i(TAG, jn_beach + ":" + cfg.beach);

            cfg.beachList = new ArrayList<>();
            cfg.beachCountList = new ArrayList<>();
            if (jsonObj.has(jn_beachList)) {
                ja = jsonObj.getJSONArray(jn_beachList);
                for (int i = 0; i < ja.length(); i++) {
                    if (ja.get(i) instanceof JSONArray) {
                        jaa = ja.getJSONArray(i);
                        cfg.beachList.add(jaa.getString(0));
                        cfg.beachCountList.add(jaa.getInt(1));
                    } else {
                        cfg.beachList.add(ja.getString(i));
                        cfg.beachCountList.add(2);
                    }
                }
            }
            //Log.i(TAG, jn_beachList + ":" + String.join(",", cfg.beachList));

            cfg.exchangeEnergyDoubleClick = jsonObj.optBoolean("exchangeEnergyDoubleClick", false);
            Log.i(TAG, "exchangeEnergyDoubleClick" + ":" + cfg.exchangeEnergyDoubleClick);

            cfg.exchangeEnergyDoubleClickCount = jsonObj.optInt("exchangeEnergyDoubleClickCount", 6);
            Log.i(TAG, "exchangeEnergyDoubleClickCount" + ":" + cfg.exchangeEnergyDoubleClickCount);

            cfg.ancientTreeOnlyWeek = jsonObj.optBoolean(jn_ancientTreeOnlyWeek, true);
            //Log.i(TAG, jn_ancientTreeOnlyWeek + ":" + cfg.ancientTreeOnlyWeek);

            cfg.antdodoCollect = jsonObj.optBoolean(jn_antdodoCollect, true);
            //Log.i(TAG, jn_antdodoCollect + ":" + cfg.antdodoCollect);

            cfg.antOcean = jsonObj.optBoolean(jn_antOcean, true);
            //Log.i(TAG, jn_antOcean + ":" + cfg.antOcean);

            cfg.userPatrol = jsonObj.optBoolean(jn_userPatrol, true);
            //Log.i(TAG, jn_userPatrol + ":" + cfg.userPatrol);

            cfg.animalConsumeProp = jsonObj.optBoolean(jn_animalConsumeProp, true);
            //Log.i(TAG, jn_animalConsumeProp + ":" + cfg.animalConsumeProp);

            cfg.collectGiftBox = jsonObj.optBoolean(jn_collectGiftBox, true);
            //Log.i(TAG, jn_collectGiftBox + ":" + cfg.collectGiftBox);

            cfg.totalCertCount = jsonObj.optBoolean(jn_totalCertCount, false);

            /* farm */
            cfg.enableFarm = jsonObj.optBoolean(jn_enableFarm, true);
            //Log.i(TAG, jn_enableFarm + ":" + cfg.enableFarm);

            cfg.rewardFriend = jsonObj.optBoolean(jn_rewardFriend, true);
            //Log.i(TAG, jn_rewardFriend + ":" + cfg.rewardFriend);

            cfg.sendBackAnimal = jsonObj.optBoolean(jn_sendBackAnimal, true);
            //Log.i(TAG, jn_sendBackAnimal + ":" + cfg.sendBackAnimal);

            cfg.sendType = SendType.valueOf(jsonObj.optString(jn_sendType, SendType.HIT.name()));
            //Log.i(TAG, jn_sendType + ":" + cfg.sendType);

            cfg.dontSendFriendList = new ArrayList<>();
            if (jsonObj.has(jn_dontSendFriendList)) {
                ja = jsonObj.getJSONArray(jn_dontSendFriendList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.dontSendFriendList.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_dontSendFriendList + ":" + String.join(",", cfg.dontSendFriendList));

            cfg.recallAnimalType = RecallAnimalType
                    .valueOf(jsonObj.optString(jn_recallAnimalType, RecallAnimalType.ALWAYS.name()));
            //Log.i(TAG, jn_recallAnimalType + ":" + cfg.recallAnimalType);

            cfg.receiveFarmToolReward = jsonObj.optBoolean(jn_receiveFarmToolReward, true);
            //Log.i(TAG, jn_receiveFarmToolReward + ":" + cfg.receiveFarmToolReward);

            cfg.recordFarmGame = jsonObj.optBoolean(jn_recordFarmGame, true);
            //Log.i(TAG, jn_recordFarmGame + ":" + cfg.recordFarmGame);

            cfg.kitchen = jsonObj.optBoolean(jn_kitchen, true);
            //Log.i(TAG, jn_kitchen + ":" + cfg.kitchen);

            cfg.useNewEggTool = jsonObj.optBoolean(jn_useNewEggTool, true);
            //Log.i(TAG, jn_useNewEggTool + ":" + cfg.useNewEggTool);

            cfg.harvestProduce = jsonObj.optBoolean(jn_harvestProduce, true);
            //Log.i(TAG, jn_harvestProduce + ":" + cfg.harvestProduce);

            cfg.donation = jsonObj.optBoolean(jn_donation, true);
            //Log.i(TAG, jn_donation + ":" + cfg.donation);

            cfg.answerQuestion = jsonObj.optBoolean(jn_answerQuestion, true);
            //Log.i(TAG, jn_answerQuestion + ":" + cfg.answerQuestion);

            cfg.receiveFarmTaskAward = jsonObj.optBoolean(jn_receiveFarmTaskAward, true);
            //Log.i(TAG, jn_receiveFarmTaskAward + ":" + cfg.receiveFarmTaskAward);

            cfg.feedAnimal = jsonObj.optBoolean(jn_feedAnimal, true);
            //Log.i(TAG, jn_feedAnimal + ":" + cfg.feedAnimal);

            cfg.useAccelerateTool = jsonObj.optBoolean(jn_useAccelerateTool, true);
            //Log.i(TAG, jn_useAccelerateTool + ":" + cfg.useAccelerateTool);

            cfg.feedFriendAnimalList = new ArrayList<>();
            cfg.feedFriendCountList = new ArrayList<>();
            if (jsonObj.has(jn_feedFriendAnimalList)) {
                ja = jsonObj.getJSONArray(jn_feedFriendAnimalList);
                for (int i = 0; i < ja.length(); i++) {
                    if (ja.get(i) instanceof JSONArray) {
                        jaa = ja.getJSONArray(i);
                        cfg.feedFriendAnimalList.add(jaa.getString(0));
                        cfg.feedFriendCountList.add(jaa.getInt(1));
                    } else {
                        cfg.feedFriendAnimalList.add(ja.getString(i));
                        cfg.feedFriendCountList.add(1);
                    }
                }
            }
            //Log.i(TAG, jn_feedFriendAnimalList + ":" + String.join(",", cfg.feedFriendAnimalList));

            cfg.farmGameTime = Arrays.asList(jsonObj.optString(jn_farmGameTime, "2200-2400").split(","));
            //Log.i(TAG, jn_farmGameTime + ":" + cfg.farmGameTime);

            cfg.animalSleepTime = Arrays.asList(jsonObj.optString(jn_animalSleepTime, "2200-2400,0000-0559").split(","));
            //Log.i(TAG, jn_animalSleepTime + ":" + cfg.animalSleepTime);

            cfg.notifyFriend = jsonObj.optBoolean(jn_notifyFriend, false);
            //Log.i(TAG, jn_notifyFriend + ":" + cfg.notifyFriend);

            cfg.dontNotifyFriendList = new ArrayList<>();
            if (jsonObj.has(jn_dontNotifyFriendList)) {
                ja = jsonObj.getJSONArray(jn_dontNotifyFriendList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.dontNotifyFriendList.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_dontNotifyFriendList + ":" + String.join(",", cfg.dontNotifyFriendList));

            cfg.whoYouWantGiveTo = new ArrayList<>();
            if (jsonObj.has(jn_whoYouWantGiveTo)) {
                ja = jsonObj.getJSONArray(jn_whoYouWantGiveTo);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.whoYouWantGiveTo.add(ja.getString(i));
                }
            }
            //Log.i(TAG, jn_whoYouWantGiveTo + ":" + String.join(",", cfg.whoYouWantGiveTo));

            cfg.sendFriendCard = new ArrayList<>();
            if (jsonObj.has(jn_sendFriendCard)) {
                ja = jsonObj.getJSONArray(jn_sendFriendCard);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.sendFriendCard.add(ja.getString(i));
                }
            }

            cfg.acceptGift = jsonObj.optBoolean(jn_acceptGift, true);
            //Log.i(TAG, jn_acceptGift + ":" + cfg.acceptGift);

            cfg.visitFriendList = new ArrayList<>();
            cfg.visitFriendCountList = new ArrayList<>();
            if (jsonObj.has(jn_visitFriendList)) {
                ja = jsonObj.getJSONArray(jn_visitFriendList);
                for (int i = 0; i < ja.length(); i++) {
                    if (ja.get(i) instanceof JSONArray) {
                        jaa = ja.getJSONArray(i);
                        cfg.visitFriendList.add(jaa.getString(0));
                        cfg.visitFriendCountList.add(jaa.getInt(1));
                    } else {
                        cfg.visitFriendList.add(ja.getString(i));
                        cfg.visitFriendCountList.add(3);
                    }
                }
            }
            //Log.i(TAG, jn_visitFriendList + ":" + String.join(",", cfg.visitFriendList));

            cfg.chickenDiary = jsonObj.optBoolean(jn_chickenDiary, true);

            cfg.antOrchard = jsonObj.optBoolean(jn_antOrchard, true);
            //Log.i(TAG, jn_antOrchard + ":" + cfg.antOrchard);

            cfg.receiveOrchardTaskAward = jsonObj.optBoolean(jn_receiveOrchardTaskAward, true);
            //Log.i(TAG, jn_receiveOrchardTaskAward + ":" + cfg.receiveOrchardTaskAward);

            cfg.orchardSpreadManureCount = jsonObj.optInt(jn_orchardSpreadManureCount, 0);
            //Log.i(TAG, jn_orchardSpreadManureCount + ":" + cfg.orchardSpreadManureCount);

            cfg.enableStall = jsonObj.optBoolean(jn_enableStall, false);
            //Log.i(TAG, jn_enableStall + ":" + cfg.enableStall);

            cfg.stallAutoClose = jsonObj.optBoolean(jn_stallAutoClose, false);
            //Log.i(TAG, jn_stallAutoClose + ":" + cfg.stallAutoClose);

            cfg.stallAutoOpen = jsonObj.optBoolean(jn_stallAutoOpen, false);
            //Log.i(TAG, jn_stallAutoOpen + ":" + cfg.stallAutoOpen);

            cfg.stallAutoTask = jsonObj.optBoolean(jn_stallAutoTask, true);
            //Log.i(TAG, jn_stallAutoTask + ":" + cfg.stallAutoTask);

            cfg.stallReceiveAward = jsonObj.optBoolean(jn_stallReceiveAward, true);
            //Log.i(TAG, jn_stallReceiveAward + ":" + cfg.stallReceiveAward);

            cfg.stallOpenType = jsonObj.optBoolean(jn_stallOpenType, true);
            //Log.i(TAG, jn_stallOpenType + ":" + cfg.stallOpenType);

            cfg.stallOpenList = new ArrayList<>();
            if (jsonObj.has(jn_stallOpenList)) {
                ja = jsonObj.getJSONArray(jn_stallOpenList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.stallOpenList.add(ja.getString(i));
                }
            }

            cfg.stallWhiteList = new ArrayList<>();
            if (jsonObj.has(jn_stallWhiteList)) {
                ja = jsonObj.getJSONArray(jn_stallWhiteList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.stallWhiteList.add(ja.getString(i));
                }
            }

            cfg.stallBlackList = new ArrayList<>();
            if (jsonObj.has(jn_stallBlackList)) {
                ja = jsonObj.getJSONArray(jn_stallBlackList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.stallBlackList.add(ja.getString(i));
                }
            }

            cfg.stallAllowOpenTime = jsonObj.optInt(jn_stallAllowOpenTime, 121);

            cfg.stallSelfOpenTime = jsonObj.optInt(jn_stallSelfOpenTime, 120);

            cfg.stallDonate = jsonObj.optBoolean(jn_stallDonate, false);

            cfg.stallInviteRegister = jsonObj.optBoolean(jn_stallInviteRegister, true);

            cfg.stallThrowManure = jsonObj.optBoolean(jn_stallThrowManure, false);

            cfg.stallInviteShopList = new ArrayList<>();
            if (jsonObj.has(jn_stallInviteShopList)) {
                ja = jsonObj.getJSONArray(jn_stallInviteShopList);
                for (int i = 0; i < ja.length(); i++) {
                    cfg.stallInviteShopList.add(ja.getString(i));
                }
            }

            /* other */
            cfg.receivePoint = jsonObj.optBoolean(jn_receivePoint, true);
            //Log.i(TAG, jn_receivePoint + ":" + cfg.receivePoint);

            cfg.openTreasureBox = jsonObj.optBoolean(jn_openTreasureBox, true);
            //Log.i(TAG, jn_openTreasureBox + ":" + cfg.openTreasureBox);

            cfg.receiveCoinAsset = jsonObj.optBoolean(jn_receiveCoinAsset, true);
            //Log.i(TAG, jn_receiveCoinAsset + ":" + cfg.receiveCoinAsset);

            cfg.donateCharityCoin = jsonObj.optBoolean(jn_donateCharityCoin, false);
            //Log.i(TAG, jn_donateCharityCoin + ":" + cfg.donateCharityCoin);

            cfg.minExchangeCount = jsonObj.optInt(jn_minExchangeCount);
            //Log.i(TAG, jn_minExchangeCount + ":" + cfg.minExchangeCount);

            cfg.latestExchangeTime = jsonObj.optInt(jn_latestExchangeTime, 21);
            //Log.i(TAG, jn_latestExchangeTime + ":" + cfg.latestExchangeTime);

            cfg.syncStepCount = jsonObj.optInt(jn_syncStepCount, 22000);
            //Log.i(TAG, jn_syncStepCount + ":" + cfg.syncStepCount);

            cfg.kbSignIn = jsonObj.optBoolean(jn_kbSignIn, true);
            //Log.i(TAG, jn_kbSignIn + ":" + cfg.kbSignIn);

            cfg.ecoLifeTick = jsonObj.optBoolean(jn_ecoLifeTick, true);
            //Log.i(TAG, jn_ecoLifeTick + ":" + cfg.ecoLifeTick);

            cfg.tiyubiz = jsonObj.optBoolean(jn_tiyubiz, true);
            //Log.i(TAG, jn_tiyubiz + ":" + cfg.tiyubiz);

            cfg.insBlueBeanExchange = jsonObj.optBoolean(jn_insBlueBeanExchange, true);
            //Log.i(TAG, jn_insBlueBeanExchange + ":" + cfg.insBlueBeanExchange);

            cfg.collectSesame = jsonObj.optBoolean(jn_collectSesame, true);
            //Log.i(TAG, jn_collectSesame + ":" + cfg.collectSesame);

            cfg.zcjSignIn = jsonObj.optBoolean(jn_zcjSignIn, true);
            //Log.i(TAG, jn_zcjSignIn + ":" + cfg.zcjSignIn);

            cfg.merchantKmdk = jsonObj.optBoolean(jn_merchantKmdk, true);
            //Log.i(TAG, jn_merchantKmdk + ":" + cfg.merchantKmdk);

            cfg.greenFinance = jsonObj.optBoolean(jn_greenFinance, false);
            //Log.i(TAG, jn_greenFinance + ":" + cfg.greenFinance);

        } catch (Throwable t) {
            Log.printStackTrace(TAG, t);
            if (json != null) {
                Log.i(TAG, "配置文件格式有误，已重置配置文件并备份原文件");
                Log.infoChanged(TAG, "配置文件格式有误，已重置配置文件并备份原文件");
                FileUtils.write2File(json, FileUtils.getBackupFile(FileUtils.getConfigFile()));
            }
            cfg = defInit();
        }
        String formatted = config2Json(cfg);
        if (!formatted.equals(json)) {
            Log.i(TAG, "重新格式化 cfg.json");
            Log.infoChanged(TAG, "重新格式化 cfg.json");
            FileUtils.write2File(formatted, FileUtils.getConfigFile());
        }
        return cfg;
    }

    public static String config2Json(Config config) {
        JSONObject jsonObj = new JSONObject();
        JSONArray ja, jaa;
        try {
            if (config == null)
                config = Config.defInit();

            jsonObj.put(jn_immediateEffect, config.immediateEffect);

            jsonObj.put(jn_recordLog, config.recordLog);

            jsonObj.put(jn_showToast, config.showToast);

            jsonObj.put(jn_toastOffsetY, config.toastOffsetY);

            jsonObj.put(jn_stayAwake, config.stayAwake);

            jsonObj.put(jn_stayAwakeType, config.stayAwakeType);

            jsonObj.put(jn_stayAwakeTarget, config.stayAwakeTarget);

            jsonObj.put(jn_timeoutRestart, config.timeoutRestart);

            jsonObj.put(jn_timeoutType, config.timeoutType);

            jsonObj.put(jn_startAt7, config.startAt7);

            jsonObj.put(jn_enableOnGoing, config.enableOnGoing);

            jsonObj.put(jn_backupRuntime, config.backupRuntime);

            /* forest */
            jsonObj.put(jn_collectEnergy, config.collectEnergy);

            jsonObj.put(jn_collectWateringBubble, config.collectWateringBubble);

            jsonObj.put(jn_collectProp, config.collectProp);

            jsonObj.put(jn_checkInterval, config.checkInterval);

            jsonObj.put(jn_waitWhenException, config.waitWhenException);

            jsonObj.put("limitCollect", config.limitCollect);

            jsonObj.put("limitCount", config.limitCount);

            jsonObj.put(jn_doubleCard, config.doubleCard);

            jsonObj.put(jn_crazyMode, config.crazyMode);

            jsonObj.put(jn_doubleCardTime, String.join(",", config.doubleCardTime));

            jsonObj.put("doubleCountLimit", config.doubleCountLimit);

            jsonObj.put(jn_advanceTime, config.advanceTime);

            jsonObj.put(jn_collectInterval, config.collectInterval);

            jsonObj.put(jn_collectTimeout, config.collectTimeout);

            jsonObj.put(jn_ReturnWater33, config.returnWater33);

            jsonObj.put(jn_ReturnWater18, config.returnWater18);

            jsonObj.put(jn_ReturnWater10, config.returnWater10);

            jsonObj.put(jn_helpFriendCollect, config.helpFriendCollect);

            ja = new JSONArray();
            for (String s : config.dontCollectList) {
                ja.put(s);
            }
            jsonObj.put(jn_dontCollectList, ja);

            ja = new JSONArray();
            for (String s : config.dontHelpCollectList) {
                ja.put(s);
            }
            jsonObj.put(jn_dontHelpCollectList, ja);

            jsonObj.put(jn_receiveForestTaskAward, config.receiveForestTaskAward);

            ja = new JSONArray();
            for (int i = 0; i < config.waterFriendList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.waterFriendList.get(i));
                jaa.put(config.waterCountList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_waterFriendList, ja);

            jsonObj.put(jn_waterFriendCount, config.waterFriendCount);

            jsonObj.put(jn_cooperateWater, config.cooperateWater);

            ja = new JSONArray();
            for (int i = 0; i < config.cooperateWaterList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.cooperateWaterList.get(i));
                jaa.put(config.cooperateWaterNumList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_cooperateWaterList, ja);

            jsonObj.put(jn_ancientTree, config.ancientTree);

            ja = new JSONArray();
            for (String s : config.ancientTreeCityCodeList) {
                ja.put(s);
            }
            jsonObj.put(jn_ancientTreeAreaCodeList, ja);

            jsonObj.put(jn_reserve, config.reserve);

            ja = new JSONArray();
            for (int i = 0; i < config.reserveList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.reserveList.get(i));
                jaa.put(config.reserveCountList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_reserveList, ja);

            jsonObj.put(jn_beach, config.beach);

            ja = new JSONArray();
            for (int i = 0; i < config.beachList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.beachList.get(i));
                jaa.put(config.beachCountList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_beachList, ja);

            jsonObj.put(jn_energyRain, config.energyRain);
            ja = new JSONArray();
            for (int i = 0; i < config.giveEnergyRainList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.giveEnergyRainList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_giveEnergyRainList, ja);

            jsonObj.put("exchangeEnergyDoubleClick", config.exchangeEnergyDoubleClick);

            jsonObj.put("exchangeEnergyDoubleClickCount", config.exchangeEnergyDoubleClickCount);

            jsonObj.put(jn_ancientTreeOnlyWeek, config.ancientTreeOnlyWeek);

            jsonObj.put(jn_antdodoCollect, config.antdodoCollect);

            jsonObj.put(jn_antOcean, config.antOcean);

            jsonObj.put(jn_userPatrol, config.userPatrol);

            jsonObj.put(jn_animalConsumeProp, config.animalConsumeProp);

            jsonObj.put(jn_collectGiftBox, config.collectGiftBox);

            jsonObj.put(jn_totalCertCount, config.totalCertCount);

            /* farm */
            jsonObj.put(jn_enableFarm, config.enableFarm);

            jsonObj.put(jn_rewardFriend, config.rewardFriend);

            jsonObj.put(jn_sendBackAnimal, config.sendBackAnimal);

            jsonObj.put(jn_sendType, config.sendType.name());

            ja = new JSONArray();
            for (String s : config.dontSendFriendList) {
                ja.put(s);
            }
            jsonObj.put(jn_dontSendFriendList, ja);

            jsonObj.put(jn_recallAnimalType, config.recallAnimalType);

            jsonObj.put(jn_receiveFarmToolReward, config.receiveFarmToolReward);

            jsonObj.put(jn_recordFarmGame, config.recordFarmGame);

            jsonObj.put(jn_kitchen, config.kitchen);

            jsonObj.put(jn_useNewEggTool, config.useNewEggTool);

            jsonObj.put(jn_harvestProduce, config.harvestProduce);

            jsonObj.put(jn_donation, config.donation);

            jsonObj.put(jn_answerQuestion, config.answerQuestion);

            jsonObj.put(jn_receiveFarmTaskAward, config.receiveFarmTaskAward);

            jsonObj.put(jn_feedAnimal, config.feedAnimal);

            jsonObj.put(jn_useAccelerateTool, config.useAccelerateTool);

            ja = new JSONArray();
            for (int i = 0; i < config.feedFriendAnimalList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.feedFriendAnimalList.get(i));
                jaa.put(config.feedFriendCountList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_feedFriendAnimalList, ja);

            jsonObj.put(jn_farmGameTime, String.join(",", config.farmGameTime));

            jsonObj.put(jn_animalSleepTime, String.join(",", config.animalSleepTime));

            jsonObj.put(jn_notifyFriend, config.notifyFriend);

            ja = new JSONArray();
            for (String s : config.dontNotifyFriendList) {
                ja.put(s);
            }
            jsonObj.put(jn_dontNotifyFriendList, ja);

            ja = new JSONArray();
            for (String s : config.whoYouWantGiveTo) {
                ja.put(s);
            }
            jsonObj.put(jn_whoYouWantGiveTo, ja);

            ja = new JSONArray();
            for (String s : config.sendFriendCard) {
                ja.put(s);
            }
            jsonObj.put(jn_sendFriendCard, ja);

            jsonObj.put(jn_acceptGift, config.acceptGift);

            ja = new JSONArray();
            for (int i = 0; i < config.visitFriendList.size(); i++) {
                jaa = new JSONArray();
                jaa.put(config.visitFriendList.get(i));
                jaa.put(config.visitFriendCountList.get(i));
                ja.put(jaa);
            }
            jsonObj.put(jn_visitFriendList, ja);

            jsonObj.put(jn_chickenDiary, config.chickenDiary);

            jsonObj.put(jn_antOrchard, config.antOrchard);

            jsonObj.put(jn_receiveOrchardTaskAward, config.receiveOrchardTaskAward);

            jsonObj.put(jn_orchardSpreadManureCount, config.orchardSpreadManureCount);

            jsonObj.put(jn_enableStall, config.enableStall);
            jsonObj.put(jn_stallAutoClose, config.stallAutoClose);
            jsonObj.put(jn_stallAutoOpen, config.stallAutoOpen);
            jsonObj.put(jn_stallAutoTask, config.stallAutoTask);
            jsonObj.put(jn_stallReceiveAward, config.stallReceiveAward);
            jsonObj.put(jn_stallOpenType, config.stallOpenType);
            ja = new JSONArray();
            for (int i = 0; i < config.stallOpenList.size(); i++) {
                ja.put(config.stallOpenList.get(i));
            }
            jsonObj.put(jn_stallOpenList, ja);
            ja = new JSONArray();
            for (int i = 0; i < config.stallWhiteList.size(); i++) {
                ja.put(config.stallWhiteList.get(i));
            }
            jsonObj.put(jn_stallWhiteList, ja);
            ja = new JSONArray();
            for (int i = 0; i < config.stallBlackList.size(); i++) {
                ja.put(config.stallBlackList.get(i));
            }
            jsonObj.put(jn_stallBlackList, ja);
            jsonObj.put(jn_stallAllowOpenTime, config.stallAllowOpenTime);
            jsonObj.put(jn_stallSelfOpenTime, config.stallSelfOpenTime);
            jsonObj.put(jn_stallDonate, config.stallDonate);
            jsonObj.put(jn_stallInviteRegister, config.stallInviteRegister);
            jsonObj.put(jn_stallThrowManure, config.stallThrowManure);
            ja = new JSONArray();
            for (int i = 0; i < config.stallInviteShopList.size(); i++) {
                ja.put(config.stallInviteShopList.get(i));
            }
            jsonObj.put(jn_stallInviteShopList, ja);

            /* other */
            jsonObj.put(jn_receivePoint, config.receivePoint);

            jsonObj.put(jn_openTreasureBox, config.openTreasureBox);

            jsonObj.put(jn_receiveCoinAsset, config.receiveCoinAsset);

            jsonObj.put(jn_donateCharityCoin, config.donateCharityCoin);

            jsonObj.put(jn_minExchangeCount, config.minExchangeCount);

            jsonObj.put(jn_latestExchangeTime, config.latestExchangeTime);

            jsonObj.put(jn_syncStepCount, config.syncStepCount);

            jsonObj.put(jn_kbSignIn, config.kbSignIn);

            jsonObj.put(jn_ecoLifeTick, config.ecoLifeTick);

            jsonObj.put(jn_tiyubiz, config.tiyubiz);

            jsonObj.put(jn_insBlueBeanExchange, config.insBlueBeanExchange);

            jsonObj.put(jn_collectSesame, config.collectSesame);

            jsonObj.put(jn_zcjSignIn, config.zcjSignIn);

            jsonObj.put(jn_merchantKmdk, config.merchantKmdk);

            jsonObj.put(jn_greenFinance, config.greenFinance);

        } catch (Throwable t) {
            Log.printStackTrace(TAG, t);
        }
        return formatJson(jsonObj, false);
    }

    public static String formatJson(JSONObject jo, boolean removeQuote) {
        String formated;
        try {
            formated = jo.toString(4);
        } catch (Throwable t) {
            return jo.toString();
        }
        if (!removeQuote)
            return formated;
        StringBuilder sb = new StringBuilder(formated);
        char currentChar, lastNonSpaceChar = 0;
        for (int i = 0; i < sb.length(); i++) {
            currentChar = sb.charAt(i);
            switch (currentChar) {
                case '"':
                    switch (lastNonSpaceChar) {
                        case ':':
                        case '[':
                            sb.deleteCharAt(i);
                            i = sb.indexOf("\"", i);
                            sb.deleteCharAt(i);
                            if (lastNonSpaceChar != '[')
                                lastNonSpaceChar = sb.charAt(--i);
                    }
                    break;

                case ' ':
                    break;

                default:
                    if (lastNonSpaceChar == '[' && currentChar != ']')
                        break;
                    lastNonSpaceChar = currentChar;
            }
        }
        formated = sb.toString();
        return formated;
    }

    private static PendingIntent getAlarm7Pi(Context context) {
        if (alarm7Pi == null) {
            Intent it = new Intent();
            it.setClassName(ClassMember.PACKAGE_NAME, ClassMember.CURRENT_USING_ACTIVITY);
            int piFlag;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                piFlag = PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT;
            } else {
                piFlag = PendingIntent.FLAG_UPDATE_CURRENT;
            }
            alarm7Pi = PendingIntent.getActivity(context, 999, it, piFlag);
        }
        return alarm7Pi;
    }

    public static void setAlarm7(Context context) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
            PendingIntent pi = getAlarm7Pi(context);
            Calendar calendar = Calendar.getInstance();
            // calendar.add(Calendar.SECOND, 10);
            if (calendar.get(Calendar.HOUR_OF_DAY) >= 7) {
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
            calendar.set(Calendar.HOUR_OF_DAY, 7);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pi);
//            } else {
//                alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pi);
//            }
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(calendar.getTimeInMillis(), null), pi);
        } catch (Throwable th) {
            Log.printStackTrace("alarm7", th);
        }
    }

    public static void cancelAlarm7(Context context, boolean fromApp) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
            PendingIntent pi = getAlarm7Pi(context);
            alarmManager.cancel(pi);

            if (fromApp) {
                context.sendBroadcast(new Intent("com.eg.android.AlipayGphone.xqe.cancelAlarm7"));
            }
        } catch (Throwable th) {
            Log.printStackTrace("alarm7", th);
        }
    }

    public enum RecallAnimalType {
        ALWAYS, WHEN_THIEF, WHEN_HUNGRY, NEVER;

        public static final CharSequence[] nickNames = {"始终召回", "偷吃时召回", "饥饿时召回", "不召回"};
        public static final CharSequence[] names = {ALWAYS.nickName(), WHEN_THIEF.nickName(), WHEN_HUNGRY.nickName(),
                NEVER.nickName()};

        public CharSequence nickName() {
            return nickNames[ordinal()];
        }
    }

}
