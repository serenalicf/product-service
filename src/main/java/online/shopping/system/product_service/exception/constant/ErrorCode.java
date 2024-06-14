package online.shopping.system.product_service.exception.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import online.shopping.system.product_service.exception.ExceptionCode;
import org.apache.logging.log4j.message.ParameterizedMessage;

@Getter
@AllArgsConstructor
public enum ErrorCode implements ExceptionCode {
    PRODUCT_NOT_FOUND("P0001","product with product code : {} is not found"),

    SYSTEM_BUSY("P0002","System busy");

    private final String errorCode;
    private final String message;

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage(Object... arguments) {
        if(arguments == null){
            return message;
        }
        return new ParameterizedMessage(message, arguments).getFormattedMessage();
    }
}
