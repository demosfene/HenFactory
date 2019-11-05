public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDiscription() {
        return super.getDiscription() + "Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
