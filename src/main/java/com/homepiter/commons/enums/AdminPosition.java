package com.homepiter.commons.enums;

public enum AdminPosition {
    INTERN("인턴"),
    STAFF("사원"),
    SENIOR("주임"),
    MANAGER("대리"),
    ASSISTANT_MANAGER("과장"),
    DEPUTY_GENERAL_MANAGER("차장"),
    GENERAL_MANAGER("부장"),
    DIRECTOR("이사"),
    MANAGING_DIRECTOR("상무"),
    VICE_PRESIDENT("전무"),
    PRESIDENT("사장");

    private final String label;

    AdminPosition(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
