package com.yar9.blcadmin.presentation

object AdminPresentationProperty {
    const val EXCLUDED = "excluded" // AdminPresentation::excluded.name // not a compile-time constant value
    const val FIELD_TYPE = "fieldType"
}

typealias FieldGuiType = SupportedFieldType

object FieldGuiTypeStr {
    const val HTML_BASIC = "HTML_BASIC"
}
/**
 * The GUI type.
 */
enum class SupportedFieldType {
    /**
     * Inferred based on the filed type.
     */
    UNKNOWN,
    ID,
    BOOLEAN,
    BOOLEAN_LINK,
    DATE,
    INTEGER,
    DECIMAL,
    STRING,
    COLLECTION,
    PASSWORD,
    PASSWORD_CONFIRM,
    EMAIL,
    FOREIGN_KEY,
    ADDITIONAL_FOREIGN_KEY,
    MONEY,
    BROADLEAF_ENUMERATION,
    EXPLICIT_ENUMERATION,
    EMPTY_ENUMERATION,
    DATA_DRIVEN_ENUMERATION,
    HTML,
    HTML_BASIC,
    UPLOAD,
    HIDDEN,
    ASSET_URL,
    ASSET_LOOKUP,
    MEDIA,
    RULE_SIMPLE,
    RULE_SIMPLE_TIME,
    RULE_WITH_QUANTITY,
    STRING_LIST,
    IMAGE,
    COLOR,
    CODE,
    GENERATED_URL,
    GENERATED_FIELD_VALUE,
    DESCRIPTION
}


enum class VisibilityEnum {
    HIDDEN_ALL,
    VISIBLE_ALL,
    FORM_HIDDEN,
    GRID_HIDDEN,
    NOT_SPECIFIED,
    /**
     * This will ensure that the field is shown on the the entity form regardless of whether or not this field is
     * actually a member of the entity. Mainly used in [CustomPersistenceHandler]s for psuedo-fields that are built
     * manually and you still want user input from (like selecting [ProductOption]s to associate to a [Sku]
     */
    FORM_EXPLICITLY_SHOWN,
    FORM_EXPLICITLY_HIDDEN
}
