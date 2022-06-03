package win.api.qa.model;

public class UserPojo {
        private String name;
        private Integer available;
        private Integer amount;
        private Integer user_id;

        public void setUser_id(Integer user_id) {
            this.user_id = user_id;
        }

        public Integer getUser_id() {
            return user_id;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAvailable() {
            return available;
        }

        public void setAvailable(Integer available) {
            this.available = available;
        }
    }
