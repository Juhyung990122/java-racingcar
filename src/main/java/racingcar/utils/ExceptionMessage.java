package racingcar.utils;

public class ExceptionMessage {
    private static String ERROR_SYMBOL = "[ERROR]";
    public static String BLANK_INPUT_EXCEPTION_MESSAGE = ERROR_SYMBOL + "입력이 비어있습니다.";
    public static final String NOT_POSITIVE_DIGIT = ERROR_SYMBOL + "시도횟수는 양의 정수만 가능합니다.";

    public static final String LONGER_THAN_FIVE_CAR_NAME = "자동차 이름은 최대 5자입니다.";
}
