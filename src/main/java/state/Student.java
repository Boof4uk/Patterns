package state;

/**
 * Класс контекст, который по разному себя ведет, в зависимости от состояния
 * -определяеп поле state
 * -реализуем сеттер для него
 * -реализуем какое-то поведение, которое будет оперировать состоянием
 */
public class Student {
    private ActivityState activityState;

    public void setActivityState(ActivityState activityState) {
        this.activityState = activityState;
    }

    public void changeActivity() {
        if (activityState instanceof Sleeping) {
            setActivityState(new Learning());
            activityState.doActivity();
        } else if (activityState instanceof Learning) {
            setActivityState(new Eating());
            activityState.doActivity();
        } else if (activityState instanceof Eating) {
            setActivityState(new Sleeping());
            activityState.doActivity();
        }
    }
}
