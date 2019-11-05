public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 2000;
    }

    @Override
    String getDiscription() {
        return super.getDiscription() + "Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
