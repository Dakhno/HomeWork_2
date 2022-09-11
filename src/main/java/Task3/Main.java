package Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }


    public static boolean fuzzySearch(String fragment, String text){
        int startWith = 0;
        for(int i = 0; i < fragment.length(); i++){
            int firstInput = text.indexOf(fragment.charAt(i), startWith);
            if(firstInput != -1) startWith = firstInput + 1;
            else return false;
        }
        return true;
    }

}
