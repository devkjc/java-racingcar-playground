public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = ScannerUtils.inputString();
        Cars cars = new Cars(carNames);
        System.out.println("시도할 회수는 몇회인가요?");
        Integer repeat = ScannerUtils.inputInteger();
        cars.goCars(repeat);
    }

}
