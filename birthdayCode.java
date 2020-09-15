import javax.swing.JOptionPane;

    public class birthdayCode{
        public static void main(String[] args){
            String set1 = "1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31";
            
            String set2 = "2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31";

            String set3 = "4, 5, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22 23, 28, 29, 30, 31";

            String set4 = "8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31";

            String set5 = "16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31";

            String set6 = "1, 3, 5, 7, 9, 11";

            String set7 = "2, 3, 6, 7, 10, 11";

            String set8 = "4, 5, 6, 7, 12";

            String set9 = "8, 9, 10, 11, 12";

            int day = 0;
            int month = 0;

            //prompt the user to answer the questions
            int answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday date in these number?\n" + set1);

            if (answer == JOptionPane.YES_OPTION)
                day += 1;
            
            answer = JOptionPane.showConfirmDialog(null,
            "Is your birthday date in these numbers?\n" + set2);

            if (answer == JOptionPane.YES_OPTION)
                day += 2;
            
            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday date in these numbers?\n" + set3);

            if (answer == JOptionPane.YES_OPTION)
                day += 4;
            
            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday date in these numbers?\n" + set4);

            if (answer == JOptionPane.YES_OPTION)
                day += 8;

            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday date in these numbers?\n" + set5);

            if (answer == JOptionPane.YES_OPTION)
                day += 16;

            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday month in these numbers?\n" + set6);

            if (answer == JOptionPane.YES_OPTION)
                month += 1;

            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday month in these numbers?\n" + set7);

            if (answer == JOptionPane.YES_OPTION)
                month += 2;

            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday month in these numbers?\n" + set8);

            if (answer == JOptionPane.YES_OPTION)
                month += 4;

            answer = JOptionPane.showConfirmDialog(null, 
            "Is your birthday month in these numbers?\n" + set9);

            if (answer == JOptionPane.YES_OPTION)
                month += 8;

            JOptionPane.showMessageDialog(null, "Your birthday is " + day + "th day of the " + month + "th month!");
        }
    }