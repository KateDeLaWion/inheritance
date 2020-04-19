public class Plant {


       public  static  class tree{
//            public void swaying(){
//            static void swaying(){
                void swaying(){
                System.out.println("The tree is swaying.");
            }
        }


        public  static  class branch extends tree {
//          public void creaking(){
//          static void creaking(){
                void creaking(){
                System.out.println("Wow.  it is creaking now. ");
            }
        }


        public static void main(String[] args) {


            tree tree1 = new tree();
            tree1.swaying();

            branch branch1 = new branch();
            branch1.creaking();
            branch1.swaying();
        }




}
