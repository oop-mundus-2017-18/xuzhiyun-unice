package LivingCreature;
/**
 * @author XU ZHIYUN
 */
public enum State {
    HEALTHY("healthy"),
    SICK("sick"),
    CONTAGIOUS("contagious"),
    RECOVERING("recovering"),
    DEAD("dead");
    private String state;

    State(String state) {
        this.state = state;
    }
}
