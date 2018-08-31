package mainPackage.model.employeePackage.employeeAdditionalInfo;

public class TimeCard {
    //here we save manage all timecard infos by employees id
    private float workedHours;
    private float extraHours;

    public TimeCard(){
        this.workedHours = 0;
        this.extraHours = 0;

    }

    public float getExtraHours() {
        return extraHours;
    }

    public float getWorkedHours() {
        return workedHours;
    }


    public void setExtraHours(float extraHours) {
        this.extraHours = extraHours;
    }

    public void setWorkedHours(float workedHours) {
        this.workedHours = workedHours;
    }


    public void addExtraHours(float extraHours){
        this.extraHours += extraHours;
    }

    public void addWorkedHours(float workedHours){
        this.workedHours += workedHours;
    }

    public void setTimecard(float hours){
        if (hours > 8){
            this.workedHours += 8;
            this.extraHours += hours - 8;
            return;
        }
        this.workedHours += hours;

    }


}
