package tr.com.merciyes.commons.exception.constants;

import lombok.Getter;

@Getter
public enum CommonErrorType implements ErrorType {
    INTERNAL_ERROR("Internal Error", 500),
    INVALID_INPUT("Invalid Input", 400),
    MISSING_FIELD_VALUE("Missing Field Value", 400),
    DATA_ACCESS_EXCEPTION("Data Access Exception", 400);

    private String title;
    private int status;

    CommonErrorType(String title, int status) {
        this.title = title;
        this.status = status;
    }
}