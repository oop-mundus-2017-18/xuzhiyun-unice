package Virus;
/**
 * @author XU ZHIYUN
 */
public class H5N1 implements Virus {
    private int IncubationTime;
    private int ContagiousTime;
    private int RecovingTime;

    H5N1(int IncubationTime, int ContagiousTime, int RecovingTime) {
        this.IncubationTime = IncubationTime;
        this.RecovingTime = RecovingTime;
    }

    public int getIncubationTime() {
        return IncubationTime;
    }

    public int getContagiousTime() {
        return ContagiousTime;
    }

    public int getRecovingTime() {
        return RecovingTime;
    }
}
