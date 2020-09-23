public class ThreeByThree {
    private String shuffle;
    private int solveNo;
    private double time;

    public ThreeByThree(int s) {
        solveNo = s;
    }

    public void setStuff(String s, double t) {

        shuffle = s;
        time = t;
    }

    public int getSolveNo() {
        return solveNo;
    }

    public String newShuffle() {
        int before;
        int random;
        int orient;
        String shuf = "";
        before = (int) ((Math.random() * 6) + 1);
        for(int i = 0; i < 20; i++) {
            random = (int) ((Math.random() * 6) + 1);
            while(random == before) {
                random = (int) ((Math.random() * 6) + 1);
            }
            switch (random) {

                default :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "U";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
                case 2 :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "D";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
                case 3 :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "L";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
                case 4 :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "R";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
                case 5 :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "B";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
                case 6 :
                    orient = (int) ((Math.random() * 3) + 1);
                    shuf += "F";
                    if(orient == 2) {
                        shuf += "'";
                    }
                    if(orient == 3) {
                        shuf += "2";
                    }
                    break;
            }

            shuf += " ";
            before = random;
        }
        return shuf;
    }

    public String toString() {
        return "solve no " + solveNo + " , Shuffle : " + shuffle;
    }
}
