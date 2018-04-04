package com.yar9.blcadmin.example

import com.yar9.blcadmin.presentation.*

open class Product {
    @AdminPresentation(friendlyName = "The name")
    var name = ""

    @AdminPresentation(friendlyName = "The description", excluded = true)
    var description = ""
}

@AdminPresentationMergeOverrides(
        AdminPresentationMergeOverride(
                name = "defaultSku.description",
                mergeEntries = [AdminPresentationMergeEntry(
                        propertyType = AdminPresentationProperty.EXCLUDED,
                        booleanOverrideValue = true
                ), AdminPresentationMergeEntry(
                        propertyType = AdminPresentationProperty.FIELD_TYPE,
                        overrideValue = FieldGuiTypeStr.HTML_BASIC
                )
                ]
        ))
class MyCompanyProduct(
        @AdminPresentation(friendlyName = "My Custom Field")
        val someCustomFiled: String
) : Product()