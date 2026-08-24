package ContrlStatements;

public class BreakAndContinueExample {

    public static void main(String[] args) {
        simplaeBreak();
        simpleContinue();
    }
        public static void simplaeBreak(){
        for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    break;
                }
                System.out.println("i: " + i);
            }
        }
        public static void simpleContinue(){
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i: "+i);
        }

        }

    }

