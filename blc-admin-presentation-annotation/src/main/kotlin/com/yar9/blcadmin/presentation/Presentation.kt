package com.yar9.blcadmin.presentation

/**
 * @param friendlyName Optional. The friendly name to present to a user for this field in a GUI.
 *                      If supporting i18N, the friendly name may be a key to retrieve a localized friendly name using
 *                      the GWT support for i18N.
 * @param excluded Optional. Specify if this field should be excluded from inclusion in the admin presentation layer.
 * @param fieldType Optional. Specify the GUI type.
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class AdminPresentation(
        val friendlyName: String = "",
        val order: Int = 99999,
        val visibility: VisibilityEnum = VisibilityEnum.VISIBLE_ALL,

        val fieldType: FieldGuiType = FieldGuiType.UNKNOWN,
        val excluded: Boolean = false
)

/**
 * @param friendlyName Optional. The friendly name to present to a user for this field in a GUI.
 */
annotation class AdminPresentationClass(
        val friendlyName: String = "",
        val tabs: Array<AdminTabPresentation> = emptyArray()
)

/**
 * @param name GUI tab name.
 * @param order Optional. Tabs will be sorted in ascending order.
 */
annotation class AdminTabPresentation(
        val name: String = "General",
        val order: Int = 100,
        val groups: Array<AdminGroupPresentation> = emptyArray()
)

/**
 * @param name GUI group name.
 * @param order Optional. Groups will be sorted in ascending order.
 * @param untitled Optional. To remove group's border.
 */
annotation class AdminGroupPresentation(
        val name: String = "General",
        val order: Int = 99999,
        val untitled: Boolean = false
)
