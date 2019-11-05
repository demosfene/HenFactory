public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    String getDiscription() {
        return super.getDiscription() + "Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
