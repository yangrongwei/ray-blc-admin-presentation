package com.yar9.blcadmin.example

import com.yar9.blcadmin.presentation.AdminGroupPresentation
import com.yar9.blcadmin.presentation.AdminPresentationClass
import com.yar9.blcadmin.presentation.AdminTabPresentation

@AdminPresentationClass(
        tabs = [
            AdminTabPresentation(
                    name = Layout.TabName.General,
                    order = Layout.TabOrder.General,
                    groups = [AdminGroupPresentation(
                            name = Layout.GroupName.Description,
                            order = Layout.GroupOrder.Description,
                            untitled = true)
                    ]
            ),
            AdminTabPresentation(
                    name = Layout.TabName.Marketing,
                    order = Layout.TabOrder.Marketing,
                    groups = [AdminGroupPresentation(
                            name = Layout.GroupName.Restrictions,
                            order = Layout.GroupOrder.Restrictions
                    )]
            )
        ]
)
interface OfferAdminPresentation {
}


object Layout {
    object TabName {
        const val General = "General";
        const val Marketing = "Marketing tab";
        const val Qualifiers = "Qualifiers tab";
    }

    object TabOrder {
        const val General = 1000;
        const val Marketing = 2000;
        const val Qualifiers = 3000;
    }

    object GroupName {
        const val Description = "Description";
        const val ActivityRange = "ActivityRange";
        const val Restrictions = "Restrictions";
    }

    object GroupOrder {
        const val Description = 1000;
        const val ActivityRange = 2000;
        const val Restrictions = 5000;
    }
}
