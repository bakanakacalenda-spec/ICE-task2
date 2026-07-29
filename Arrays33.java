public class Arrays33 {
    public static void main(String[] args){
        int[][] weight = {{10,20,27},{22,5,20},{30,20,10}};
        String[] months = {"MONTH1","MONTH2","MONTH3"};
        String[] gyms = {"GYM1","GYM2","GYM3"};

        int[] maximum = new int[gyms.length];
        int[] minimum = new int[gyms.length];
        int[] total = new int[gyms.length];
        double[] average = new double[gyms.length];

        System.out.println("GYM WEIGHT-LOSS APPLICATION");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for(int i = 0; i < gyms.length; i++) {
            minimum[i] = weight[i][0];
            maximum[i] = weight[i][0];

            for (int row = 0; row < months.length; row++) {
                total[i] += weight[row][i];

                if (weight[row][i] < minimum[i]) {
                    minimum[i] = weight[row][i];
                }
                if (weight[row][i] > maximum[i]) {
                    maximum[i] = weight[row][i];
                }

            }
            average[i] = (double) total[i] / months.length;
        }

        System.out.printf("%-11s","");
        System.out.printf("%-11s%-11s%-11s%-6s%-11s%-11s%-11s%-11s\n",
                "MONTH1", "MONTH2", "MONTH3","|","TOTAL", "AVERAGE", "MAX", "MIN");

        for(int j = 0; j < gyms.length; j++) {
            System.out.printf("%-11s", gyms[j]);

            for(int clm = 0; clm < months.length; clm++) {
                System.out.printf("%-11s", weight[j][clm] + "kg");
            }

            System.out.printf("%-7s","|");
            String formattedAve = String.format("%.2fkg", average[j]);
            System.out.printf("%-11s%-11s%-11s%-11s\n",
                    total[j] + "kg", formattedAve , maximum[j] + "kg" ,minimum[j] + "kg" );
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}

