package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class StepTracker {

    int numActiveDays;
    int numTrackedDays;
    int totalSteps;
    int activeDayStepCount;

    /*
    Constructor Method. Takes in an integer representing the cut off for number of steps that counts for an 'active day'
      Also instantiates all other field members to 0.
    */
    StepTracker(int activeDayStepCount){
        this.activeDayStepCount = activeDayStepCount;
        numActiveDays = 0;
        numTrackedDays = 0;
        totalSteps = 0;
    }
    /*
    Adds the number of steps walked today to the total number of steps tracked. Increments the number of tracked days by 1,
      and if the number of added steps is equal to or greater than the activeDayStepCount member, increments the number
      of active days by 1, too.
    * */
    public void addDailySteps(int numSteps){
        totalSteps += numSteps;
        numTrackedDays++;
        if(numSteps >= activeDayStepCount){
            numActiveDays++;
        }
    }
    //Returns the number of active days tracked
    public int activeDays(){
        return numActiveDays;
    }
    //casts total steps to double, then returns the average steps over the number of tracked days.
    public double averageSteps(){
        if(numTrackedDays == 0){
            return 0.0;
        }
        return (double) totalSteps / numTrackedDays;}

    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
