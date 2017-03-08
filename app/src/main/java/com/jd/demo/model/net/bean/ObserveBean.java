package com.jd.demo.model.net.bean;

/**
 * Created by lenovo on 2017/3/8.
 */
public class ObserveBean {

    /**
     * code : 1
     * msg : Sucess
     * counts : 19999
     * data : {"cityId":"CH010100","cityName":"北京","lastUpdate":"2017-03-08 16:10:00","tq":"晴","numtq":"00","qw":"12.0","numfl":3,"fl":"5-6级","fx":"西风","numfx":"6","sd":"11.0"}
     */

    private int code;
    private String msg;
    private int counts;
    /**
     * cityId : CH010100
     * cityName : 北京
     * lastUpdate : 2017-03-08 16:10:00
     * tq : 晴
     * numtq : 00
     * qw : 12.0
     * numfl : 3
     * fl : 5-6级
     * fx : 西风
     * numfx : 6
     * sd : 11.0
     */

    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String cityId;
        private String cityName;
        private String lastUpdate;
        private String tq;
        private String numtq;
        private String qw;
        private int numfl;
        private String fl;
        private String fx;
        private String numfx;
        private String sd;

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getLastUpdate() {
            return lastUpdate;
        }

        public void setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
        }

        public String getTq() {
            return tq;
        }

        public void setTq(String tq) {
            this.tq = tq;
        }

        public String getNumtq() {
            return numtq;
        }

        public void setNumtq(String numtq) {
            this.numtq = numtq;
        }

        public String getQw() {
            return qw;
        }

        public void setQw(String qw) {
            this.qw = qw;
        }

        public int getNumfl() {
            return numfl;
        }

        public void setNumfl(int numfl) {
            this.numfl = numfl;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getFx() {
            return fx;
        }

        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getNumfx() {
            return numfx;
        }

        public void setNumfx(String numfx) {
            this.numfx = numfx;
        }

        public String getSd() {
            return sd;
        }

        public void setSd(String sd) {
            this.sd = sd;
        }
    }
}
