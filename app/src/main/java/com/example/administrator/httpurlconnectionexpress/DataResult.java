package com.example.administrator.httpurlconnectionexpress;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */

public class DataResult {

    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : {"company":"顺丰","com":"sf","no":"929695769779","status":"1","list":[{"datetime":"2017-02-18 19:21:18","remark":"顺丰速运 已收取快件","zone":""},{"datetime":"2017-02-18 20:08:18","remark":"快件在【海口美兰康业花园营业点】已装车，准备发往 【海口美兰集散中心】","zone":""},{"datetime":"2017-02-18 20:49:26","remark":"快件到达 【海口美兰集散中心】","zone":""},{"datetime":"2017-02-18 22:30:00","remark":"快件在【海口美兰集散中心】已装车，准备发往 【广州白云集散中心】","zone":""},{"datetime":"2017-02-19 09:28:19","remark":"快件到达 【广州白云集散中心】","zone":""},{"datetime":"2017-02-19 10:11:52","remark":"快件在【广州白云集散中心】已装车，准备发往 【广州新塘集散中心】","zone":""},{"datetime":"2017-02-19 12:01:39","remark":"快件到达 【广州新塘集散中心】","zone":""},{"datetime":"2017-02-19 14:00:11","remark":"快件在【广州新塘集散中心】已装车，准备发往 【广州天河长湴东路营业点】","zone":""},{"datetime":"2017-02-19 15:20:59","remark":"快件到达 【广州天河长湴东路营业点】","zone":""},{"datetime":"2017-02-19 15:23:39","remark":"正在派送途中,请您准备签收(派件人:周柱,电话:13924267454)","zone":""},{"datetime":"2017-02-19 16:12:58","remark":"快件派送不成功(因电话无人接听/关机/无信号，暂无法联系到收方客户),正在处理中,待再次派送","zone":""},{"datetime":"2017-02-20 07:41:03","remark":"正在派送途中,请您准备签收(派件人:周柱,电话:13924267454)","zone":""},{"datetime":"2017-02-20 12:12:06","remark":"已签收,感谢使用顺丰,期待再次为您服务","zone":""}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * company : 顺丰
     * com : sf
     * no : 929695769779
     * status : 1
     * list : [{"datetime":"2017-02-18 19:21:18","remark":"顺丰速运 已收取快件","zone":""},{"datetime":"2017-02-18 20:08:18","remark":"快件在【海口美兰康业花园营业点】已装车，准备发往 【海口美兰集散中心】","zone":""},{"datetime":"2017-02-18 20:49:26","remark":"快件到达 【海口美兰集散中心】","zone":""},{"datetime":"2017-02-18 22:30:00","remark":"快件在【海口美兰集散中心】已装车，准备发往 【广州白云集散中心】","zone":""},{"datetime":"2017-02-19 09:28:19","remark":"快件到达 【广州白云集散中心】","zone":""},{"datetime":"2017-02-19 10:11:52","remark":"快件在【广州白云集散中心】已装车，准备发往 【广州新塘集散中心】","zone":""},{"datetime":"2017-02-19 12:01:39","remark":"快件到达 【广州新塘集散中心】","zone":""},{"datetime":"2017-02-19 14:00:11","remark":"快件在【广州新塘集散中心】已装车，准备发往 【广州天河长湴东路营业点】","zone":""},{"datetime":"2017-02-19 15:20:59","remark":"快件到达 【广州天河长湴东路营业点】","zone":""},{"datetime":"2017-02-19 15:23:39","remark":"正在派送途中,请您准备签收(派件人:周柱,电话:13924267454)","zone":""},{"datetime":"2017-02-19 16:12:58","remark":"快件派送不成功(因电话无人接听/关机/无信号，暂无法联系到收方客户),正在处理中,待再次派送","zone":""},{"datetime":"2017-02-20 07:41:03","remark":"正在派送途中,请您准备签收(派件人:周柱,电话:13924267454)","zone":""},{"datetime":"2017-02-20 12:12:06","remark":"已签收,感谢使用顺丰,期待再次为您服务","zone":""}]
     */

    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String company;
        private String com;
        private String no;
        private String status;
        /**
         * datetime : 2017-02-18 19:21:18
         * remark : 顺丰速运 已收取快件
         * zone :
         */

        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String datetime;
            private String remark;
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
