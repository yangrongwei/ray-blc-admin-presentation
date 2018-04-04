package com.yar9.blcadmin.presentation

import kotlin.reflect.KProperty1

/**
 * Class level starting-point annotation for [AdminPresentationMergeOverride]
 */
@Target(AnnotationTarget.CLASS)
annotation class AdminPresentationMergeOverrides(
        vararg val value: AdminPresentationMergeOverride
)

/**
 * To override a property of an entity. The property is annotated by [AdminPresentation]
 *
 * @param name The name of the property that should be overwritten.
 * @param mergeEntries The array of override configuration values.
 */
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class AdminPresentationMergeOverride(
        val name: String,
        val mergeEntries: Array<AdminPresentationMergeEntry>
)

/**
 * To override a property of [AdminPresentation]
 */
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class AdminPresentationMergeEntry(
        val propertyType: String,
        val overrideValue : String = "",
        val booleanOverrideValue: Boolean = false
)
