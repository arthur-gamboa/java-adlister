public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
//            adsDao = new ListAdsDao();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
