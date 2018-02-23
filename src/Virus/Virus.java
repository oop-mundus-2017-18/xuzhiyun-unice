package Virus;
/**
 * @author XU ZHIYUN
 */
public interface Virus {
    int IncubationTime = 0;
    int RecovingTime = 0;
    int ContagiousTime = 0;

    public int getIncubationTime();

    public int getRecovingTime();

    public int getContagiousTime();
}
