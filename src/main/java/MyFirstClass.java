public class MyFirstClass {
        private String title;
        private int price;
        private String platform;

        public MyFirstClass(String title, String platform, int price){
            if (price < 0){
                throw new IllegalArgumentException("Price is lower than 0");
            }
            if(title == null || title == ""){
                throw new IllegalArgumentException("Title is not entered!");
            }
            if(platform == null || platform == ""){
                throw new IllegalArgumentException("Platform name is not entered!");
            }
            this.title = title;
            this.platform = platform;
            this.price = price;
        }

        public String getTitle(){
            return this.title;
        }

        public String getPlatform(){
            return this.platform;
        }

        public int getPrice(){
            return this.price;
        }



}
