package io.twinkle.unreal.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

object DefaultTheme : BaseTheme {

    private val primaryLight = Color(0xFF8F4C38)
    private val onPrimaryLight = Color(0xFFFFFFFF)
    private val primaryContainerLight = Color(0xFFFFDBD1)
    private val onPrimaryContainerLight = Color(0xFF3A0B01)
    private val secondaryLight = Color(0xFF77574E)
    private val onSecondaryLight = Color(0xFFFFFFFF)
    private val secondaryContainerLight = Color(0xFFFFDBD1)
    private val onSecondaryContainerLight = Color(0xFF2C150F)
    private val tertiaryLight = Color(0xFF6C5D2F)
    private val onTertiaryLight = Color(0xFFFFFFFF)
    private val tertiaryContainerLight = Color(0xFFF5E1A7)
    private val onTertiaryContainerLight = Color(0xFF231B00)
    private val errorLight = Color(0xFFBA1A1A)
    private val onErrorLight = Color(0xFFFFFFFF)
    private val errorContainerLight = Color(0xFFFFDAD6)
    private val onErrorContainerLight = Color(0xFF410002)
    private val backgroundLight = Color(0xFFFFF8F6)
    private val onBackgroundLight = Color(0xFF231917)
    private val surfaceLight = Color(0xFFFFF8F6)
    private val onSurfaceLight = Color(0xFF231917)
    private val surfaceVariantLight = Color(0xFFF5DED8)
    private val onSurfaceVariantLight = Color(0xFF53433F)
    private val outlineLight = Color(0xFF85736E)
    private val outlineVariantLight = Color(0xFFD8C2BC)
    private val scrimLight = Color(0xFF000000)
    private val inverseSurfaceLight = Color(0xFF392E2B)
    private val inverseOnSurfaceLight = Color(0xFFFFEDE8)
    private val inversePrimaryLight = Color(0xFFFFB5A0)
    private val surfaceDimLight = Color(0xFFE8D6D2)
    private val surfaceBrightLight = Color(0xFFFFF8F6)
    private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
    private val surfaceContainerLowLight = Color(0xFFFFF1ED)
    private val surfaceContainerLight = Color(0xFFFCEAE5)
    private val surfaceContainerHighLight = Color(0xFFF7E4E0)
    private val surfaceContainerHighestLight = Color(0xFFF1DFDA)

    private val primaryLightMediumContrast = Color(0xFF6D311F)
    private val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
    private val primaryContainerLightMediumContrast = Color(0xFFAA614C)
    private val onPrimaryContainerLightMediumContrast = Color(0xFFFFFFFF)
    private val secondaryLightMediumContrast = Color(0xFF593C34)
    private val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
    private val secondaryContainerLightMediumContrast = Color(0xFF8F6D63)
    private val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
    private val tertiaryLightMediumContrast = Color(0xFF4E4216)
    private val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
    private val tertiaryContainerLightMediumContrast = Color(0xFF837442)
    private val onTertiaryContainerLightMediumContrast = Color(0xFFFFFFFF)
    private val errorLightMediumContrast = Color(0xFF8C0009)
    private val onErrorLightMediumContrast = Color(0xFFFFFFFF)
    private val errorContainerLightMediumContrast = Color(0xFFDA342E)
    private val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
    private val backgroundLightMediumContrast = Color(0xFFFFF8F6)
    private val onBackgroundLightMediumContrast = Color(0xFF231917)
    private val surfaceLightMediumContrast = Color(0xFFFFF8F6)
    private val onSurfaceLightMediumContrast = Color(0xFF231917)
    private val surfaceVariantLightMediumContrast = Color(0xFFF5DED8)
    private val onSurfaceVariantLightMediumContrast = Color(0xFF4F3F3B)
    private val outlineLightMediumContrast = Color(0xFF6C5B57)
    private val outlineVariantLightMediumContrast = Color(0xFF897772)
    private val scrimLightMediumContrast = Color(0xFF000000)
    private val inverseSurfaceLightMediumContrast = Color(0xFF392E2B)
    private val inverseOnSurfaceLightMediumContrast = Color(0xFFFFEDE8)
    private val inversePrimaryLightMediumContrast = Color(0xFFFFB5A0)
    private val surfaceDimLightMediumContrast = Color(0xFFE8D6D2)
    private val surfaceBrightLightMediumContrast = Color(0xFFFFF8F6)
    private val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
    private val surfaceContainerLowLightMediumContrast = Color(0xFFFFF1ED)
    private val surfaceContainerLightMediumContrast = Color(0xFFFCEAE5)
    private val surfaceContainerHighLightMediumContrast = Color(0xFFF7E4E0)
    private val surfaceContainerHighestLightMediumContrast = Color(0xFFF1DFDA)

    private val primaryLightHighContrast = Color(0xFF431104)
    private val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
    private val primaryContainerLightHighContrast = Color(0xFF6D311F)
    private val onPrimaryContainerLightHighContrast = Color(0xFFFFFFFF)
    private val secondaryLightHighContrast = Color(0xFF341C15)
    private val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
    private val secondaryContainerLightHighContrast = Color(0xFF593C34)
    private val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
    private val tertiaryLightHighContrast = Color(0xFF2B2100)
    private val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
    private val tertiaryContainerLightHighContrast = Color(0xFF4E4216)
    private val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
    private val errorLightHighContrast = Color(0xFF4E0002)
    private val onErrorLightHighContrast = Color(0xFFFFFFFF)
    private val errorContainerLightHighContrast = Color(0xFF8C0009)
    private val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
    private val backgroundLightHighContrast = Color(0xFFFFF8F6)
    private val onBackgroundLightHighContrast = Color(0xFF231917)
    private val surfaceLightHighContrast = Color(0xFFFFF8F6)
    private val onSurfaceLightHighContrast = Color(0xFF000000)
    private val surfaceVariantLightHighContrast = Color(0xFFF5DED8)
    private val onSurfaceVariantLightHighContrast = Color(0xFF2E211D)
    private val outlineLightHighContrast = Color(0xFF4F3F3B)
    private val outlineVariantLightHighContrast = Color(0xFF4F3F3B)
    private val scrimLightHighContrast = Color(0xFF000000)
    private val inverseSurfaceLightHighContrast = Color(0xFF392E2B)
    private val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
    private val inversePrimaryLightHighContrast = Color(0xFFFFE7E1)
    private val surfaceDimLightHighContrast = Color(0xFFE8D6D2)
    private val surfaceBrightLightHighContrast = Color(0xFFFFF8F6)
    private val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
    private val surfaceContainerLowLightHighContrast = Color(0xFFFFF1ED)
    private val surfaceContainerLightHighContrast = Color(0xFFFCEAE5)
    private val surfaceContainerHighLightHighContrast = Color(0xFFF7E4E0)
    private val surfaceContainerHighestLightHighContrast = Color(0xFFF1DFDA)

    private val primaryDark = Color(0xFFFFB5A0)
    private val onPrimaryDark = Color(0xFF561F0F)
    private val primaryContainerDark = Color(0xFF723523)
    private val onPrimaryContainerDark = Color(0xFFFFDBD1)
    private val secondaryDark = Color(0xFFE7BDB2)
    private val onSecondaryDark = Color(0xFF442A22)
    private val secondaryContainerDark = Color(0xFF5D4037)
    private val onSecondaryContainerDark = Color(0xFFFFDBD1)
    private val tertiaryDark = Color(0xFFD8C58D)
    private val onTertiaryDark = Color(0xFF3B2F05)
    private val tertiaryContainerDark = Color(0xFF534619)
    private val onTertiaryContainerDark = Color(0xFFF5E1A7)
    private val errorDark = Color(0xFFFFB4AB)
    private val onErrorDark = Color(0xFF690005)
    private val errorContainerDark = Color(0xFF93000A)
    private val onErrorContainerDark = Color(0xFFFFDAD6)
    private val backgroundDark = Color(0xFF1A110F)
    private val onBackgroundDark = Color(0xFFF1DFDA)
    private val surfaceDark = Color(0xFF1A110F)
    private val onSurfaceDark = Color(0xFFF1DFDA)
    private val surfaceVariantDark = Color(0xFF53433F)
    private val onSurfaceVariantDark = Color(0xFFD8C2BC)
    private val outlineDark = Color(0xFFA08C87)
    private val outlineVariantDark = Color(0xFF53433F)
    private val scrimDark = Color(0xFF000000)
    private val inverseSurfaceDark = Color(0xFFF1DFDA)
    private val inverseOnSurfaceDark = Color(0xFF392E2B)
    private val inversePrimaryDark = Color(0xFF8F4C38)
    private val surfaceDimDark = Color(0xFF1A110F)
    private val surfaceBrightDark = Color(0xFF423734)
    private val surfaceContainerLowestDark = Color(0xFF140C0A)
    private val surfaceContainerLowDark = Color(0xFF231917)
    private val surfaceContainerDark = Color(0xFF271D1B)
    private val surfaceContainerHighDark = Color(0xFF322825)
    private val surfaceContainerHighestDark = Color(0xFF3D322F)

    private val primaryDarkMediumContrast = Color(0xFFFFBBA7)
    private val onPrimaryDarkMediumContrast = Color(0xFF310700)
    private val primaryContainerDarkMediumContrast = Color(0xFFCB7C65)
    private val onPrimaryContainerDarkMediumContrast = Color(0xFF000000)
    private val secondaryDarkMediumContrast = Color(0xFFECC1B6)
    private val onSecondaryDarkMediumContrast = Color(0xFF26100A)
    private val secondaryContainerDarkMediumContrast = Color(0xFFAE887E)
    private val onSecondaryContainerDarkMediumContrast = Color(0xFF000000)
    private val tertiaryDarkMediumContrast = Color(0xFFDDCA91)
    private val onTertiaryDarkMediumContrast = Color(0xFF1D1600)
    private val tertiaryContainerDarkMediumContrast = Color(0xFFA0905C)
    private val onTertiaryContainerDarkMediumContrast = Color(0xFF000000)
    private val errorDarkMediumContrast = Color(0xFFFFBAB1)
    private val onErrorDarkMediumContrast = Color(0xFF370001)
    private val errorContainerDarkMediumContrast = Color(0xFFFF5449)
    private val onErrorContainerDarkMediumContrast = Color(0xFF000000)
    private val backgroundDarkMediumContrast = Color(0xFF1A110F)
    private val onBackgroundDarkMediumContrast = Color(0xFFF1DFDA)
    private val surfaceDarkMediumContrast = Color(0xFF1A110F)
    private val onSurfaceDarkMediumContrast = Color(0xFFFFF9F8)
    private val surfaceVariantDarkMediumContrast = Color(0xFF53433F)
    private val onSurfaceVariantDarkMediumContrast = Color(0xFFDCC6C0)
    private val outlineDarkMediumContrast = Color(0xFFB39E99)
    private val outlineVariantDarkMediumContrast = Color(0xFF927F7A)
    private val scrimDarkMediumContrast = Color(0xFF000000)
    private val inverseSurfaceDarkMediumContrast = Color(0xFFF1DFDA)
    private val inverseOnSurfaceDarkMediumContrast = Color(0xFF322825)
    private val inversePrimaryDarkMediumContrast = Color(0xFF743624)
    private val surfaceDimDarkMediumContrast = Color(0xFF1A110F)
    private val surfaceBrightDarkMediumContrast = Color(0xFF423734)
    private val surfaceContainerLowestDarkMediumContrast = Color(0xFF140C0A)
    private val surfaceContainerLowDarkMediumContrast = Color(0xFF231917)
    private val surfaceContainerDarkMediumContrast = Color(0xFF271D1B)
    private val surfaceContainerHighDarkMediumContrast = Color(0xFF322825)
    private val surfaceContainerHighestDarkMediumContrast = Color(0xFF3D322F)

    private val primaryDarkHighContrast = Color(0xFFFFF9F8)
    private val onPrimaryDarkHighContrast = Color(0xFF000000)
    private val primaryContainerDarkHighContrast = Color(0xFFFFBBA7)
    private val onPrimaryContainerDarkHighContrast = Color(0xFF000000)
    private val secondaryDarkHighContrast = Color(0xFFFFF9F8)
    private val onSecondaryDarkHighContrast = Color(0xFF000000)
    private val secondaryContainerDarkHighContrast = Color(0xFFECC1B6)
    private val onSecondaryContainerDarkHighContrast = Color(0xFF000000)
    private val tertiaryDarkHighContrast = Color(0xFFFFFAF6)
    private val onTertiaryDarkHighContrast = Color(0xFF000000)
    private val tertiaryContainerDarkHighContrast = Color(0xFFDDCA91)
    private val onTertiaryContainerDarkHighContrast = Color(0xFF000000)
    private val errorDarkHighContrast = Color(0xFFFFF9F9)
    private val onErrorDarkHighContrast = Color(0xFF000000)
    private val errorContainerDarkHighContrast = Color(0xFFFFBAB1)
    private val onErrorContainerDarkHighContrast = Color(0xFF000000)
    private val backgroundDarkHighContrast = Color(0xFF1A110F)
    private val onBackgroundDarkHighContrast = Color(0xFFF1DFDA)
    private val surfaceDarkHighContrast = Color(0xFF1A110F)
    private val onSurfaceDarkHighContrast = Color(0xFFFFFFFF)
    private val surfaceVariantDarkHighContrast = Color(0xFF53433F)
    private val onSurfaceVariantDarkHighContrast = Color(0xFFFFF9F8)
    private val outlineDarkHighContrast = Color(0xFFDCC6C0)
    private val outlineVariantDarkHighContrast = Color(0xFFDCC6C0)
    private val scrimDarkHighContrast = Color(0xFF000000)
    private val inverseSurfaceDarkHighContrast = Color(0xFFF1DFDA)
    private val inverseOnSurfaceDarkHighContrast = Color(0xFF000000)
    private val inversePrimaryDarkHighContrast = Color(0xFF4D1909)
    private val surfaceDimDarkHighContrast = Color(0xFF1A110F)
    private val surfaceBrightDarkHighContrast = Color(0xFF423734)
    private val surfaceContainerLowestDarkHighContrast = Color(0xFF140C0A)
    private val surfaceContainerLowDarkHighContrast = Color(0xFF231917)
    private val surfaceContainerDarkHighContrast = Color(0xFF271D1B)
    private val surfaceContainerHighDarkHighContrast = Color(0xFF322825)
    private val surfaceContainerHighestDarkHighContrast = Color(0xFF3D322F)

    override val lightScheme = lightColorScheme(
        primary = primaryLight,
        onPrimary = onPrimaryLight,
        primaryContainer = primaryContainerLight,
        onPrimaryContainer = onPrimaryContainerLight,
        secondary = secondaryLight,
        onSecondary = onSecondaryLight,
        secondaryContainer = secondaryContainerLight,
        onSecondaryContainer = onSecondaryContainerLight,
        tertiary = tertiaryLight,
        onTertiary = onTertiaryLight,
        tertiaryContainer = tertiaryContainerLight,
        onTertiaryContainer = onTertiaryContainerLight,
        error = errorLight,
        onError = onErrorLight,
        errorContainer = errorContainerLight,
        onErrorContainer = onErrorContainerLight,
        background = backgroundLight,
        onBackground = onBackgroundLight,
        surface = surfaceLight,
        onSurface = onSurfaceLight,
        surfaceVariant = surfaceVariantLight,
        onSurfaceVariant = onSurfaceVariantLight,
        outline = outlineLight,
        outlineVariant = outlineVariantLight,
        scrim = scrimLight,
        inverseSurface = inverseSurfaceLight,
        inverseOnSurface = inverseOnSurfaceLight,
        inversePrimary = inversePrimaryLight,
        surfaceDim = surfaceDimLight,
        surfaceBright = surfaceBrightLight,
        surfaceContainerLowest = surfaceContainerLowestLight,
        surfaceContainerLow = surfaceContainerLowLight,
        surfaceContainer = surfaceContainerLight,
        surfaceContainerHigh = surfaceContainerHighLight,
        surfaceContainerHighest = surfaceContainerHighestLight,
    )

    override val darkScheme = darkColorScheme(
        primary = primaryDark,
        onPrimary = onPrimaryDark,
        primaryContainer = primaryContainerDark,
        onPrimaryContainer = onPrimaryContainerDark,
        secondary = secondaryDark,
        onSecondary = onSecondaryDark,
        secondaryContainer = secondaryContainerDark,
        onSecondaryContainer = onSecondaryContainerDark,
        tertiary = tertiaryDark,
        onTertiary = onTertiaryDark,
        tertiaryContainer = tertiaryContainerDark,
        onTertiaryContainer = onTertiaryContainerDark,
        error = errorDark,
        onError = onErrorDark,
        errorContainer = errorContainerDark,
        onErrorContainer = onErrorContainerDark,
        background = backgroundDark,
        onBackground = onBackgroundDark,
        surface = surfaceDark,
        onSurface = onSurfaceDark,
        surfaceVariant = surfaceVariantDark,
        onSurfaceVariant = onSurfaceVariantDark,
        outline = outlineDark,
        outlineVariant = outlineVariantDark,
        scrim = scrimDark,
        inverseSurface = inverseSurfaceDark,
        inverseOnSurface = inverseOnSurfaceDark,
        inversePrimary = inversePrimaryDark,
        surfaceDim = surfaceDimDark,
        surfaceBright = surfaceBrightDark,
        surfaceContainerLowest = surfaceContainerLowestDark,
        surfaceContainerLow = surfaceContainerLowDark,
        surfaceContainer = surfaceContainerDark,
        surfaceContainerHigh = surfaceContainerHighDark,
        surfaceContainerHighest = surfaceContainerHighestDark,
    )

    override val mediumContrastLightColorScheme = lightColorScheme(
        primary = primaryLightMediumContrast,
        onPrimary = onPrimaryLightMediumContrast,
        primaryContainer = primaryContainerLightMediumContrast,
        onPrimaryContainer = onPrimaryContainerLightMediumContrast,
        secondary = secondaryLightMediumContrast,
        onSecondary = onSecondaryLightMediumContrast,
        secondaryContainer = secondaryContainerLightMediumContrast,
        onSecondaryContainer = onSecondaryContainerLightMediumContrast,
        tertiary = tertiaryLightMediumContrast,
        onTertiary = onTertiaryLightMediumContrast,
        tertiaryContainer = tertiaryContainerLightMediumContrast,
        onTertiaryContainer = onTertiaryContainerLightMediumContrast,
        error = errorLightMediumContrast,
        onError = onErrorLightMediumContrast,
        errorContainer = errorContainerLightMediumContrast,
        onErrorContainer = onErrorContainerLightMediumContrast,
        background = backgroundLightMediumContrast,
        onBackground = onBackgroundLightMediumContrast,
        surface = surfaceLightMediumContrast,
        onSurface = onSurfaceLightMediumContrast,
        surfaceVariant = surfaceVariantLightMediumContrast,
        onSurfaceVariant = onSurfaceVariantLightMediumContrast,
        outline = outlineLightMediumContrast,
        outlineVariant = outlineVariantLightMediumContrast,
        scrim = scrimLightMediumContrast,
        inverseSurface = inverseSurfaceLightMediumContrast,
        inverseOnSurface = inverseOnSurfaceLightMediumContrast,
        inversePrimary = inversePrimaryLightMediumContrast,
        surfaceDim = surfaceDimLightMediumContrast,
        surfaceBright = surfaceBrightLightMediumContrast,
        surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
        surfaceContainerLow = surfaceContainerLowLightMediumContrast,
        surfaceContainer = surfaceContainerLightMediumContrast,
        surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
        surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
    )

    override val highContrastLightColorScheme = lightColorScheme(
        primary = primaryLightHighContrast,
        onPrimary = onPrimaryLightHighContrast,
        primaryContainer = primaryContainerLightHighContrast,
        onPrimaryContainer = onPrimaryContainerLightHighContrast,
        secondary = secondaryLightHighContrast,
        onSecondary = onSecondaryLightHighContrast,
        secondaryContainer = secondaryContainerLightHighContrast,
        onSecondaryContainer = onSecondaryContainerLightHighContrast,
        tertiary = tertiaryLightHighContrast,
        onTertiary = onTertiaryLightHighContrast,
        tertiaryContainer = tertiaryContainerLightHighContrast,
        onTertiaryContainer = onTertiaryContainerLightHighContrast,
        error = errorLightHighContrast,
        onError = onErrorLightHighContrast,
        errorContainer = errorContainerLightHighContrast,
        onErrorContainer = onErrorContainerLightHighContrast,
        background = backgroundLightHighContrast,
        onBackground = onBackgroundLightHighContrast,
        surface = surfaceLightHighContrast,
        onSurface = onSurfaceLightHighContrast,
        surfaceVariant = surfaceVariantLightHighContrast,
        onSurfaceVariant = onSurfaceVariantLightHighContrast,
        outline = outlineLightHighContrast,
        outlineVariant = outlineVariantLightHighContrast,
        scrim = scrimLightHighContrast,
        inverseSurface = inverseSurfaceLightHighContrast,
        inverseOnSurface = inverseOnSurfaceLightHighContrast,
        inversePrimary = inversePrimaryLightHighContrast,
        surfaceDim = surfaceDimLightHighContrast,
        surfaceBright = surfaceBrightLightHighContrast,
        surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
        surfaceContainerLow = surfaceContainerLowLightHighContrast,
        surfaceContainer = surfaceContainerLightHighContrast,
        surfaceContainerHigh = surfaceContainerHighLightHighContrast,
        surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
    )

    override val mediumContrastDarkColorScheme = darkColorScheme(
        primary = primaryDarkMediumContrast,
        onPrimary = onPrimaryDarkMediumContrast,
        primaryContainer = primaryContainerDarkMediumContrast,
        onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
        secondary = secondaryDarkMediumContrast,
        onSecondary = onSecondaryDarkMediumContrast,
        secondaryContainer = secondaryContainerDarkMediumContrast,
        onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
        tertiary = tertiaryDarkMediumContrast,
        onTertiary = onTertiaryDarkMediumContrast,
        tertiaryContainer = tertiaryContainerDarkMediumContrast,
        onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
        error = errorDarkMediumContrast,
        onError = onErrorDarkMediumContrast,
        errorContainer = errorContainerDarkMediumContrast,
        onErrorContainer = onErrorContainerDarkMediumContrast,
        background = backgroundDarkMediumContrast,
        onBackground = onBackgroundDarkMediumContrast,
        surface = surfaceDarkMediumContrast,
        onSurface = onSurfaceDarkMediumContrast,
        surfaceVariant = surfaceVariantDarkMediumContrast,
        onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
        outline = outlineDarkMediumContrast,
        outlineVariant = outlineVariantDarkMediumContrast,
        scrim = scrimDarkMediumContrast,
        inverseSurface = inverseSurfaceDarkMediumContrast,
        inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
        inversePrimary = inversePrimaryDarkMediumContrast,
        surfaceDim = surfaceDimDarkMediumContrast,
        surfaceBright = surfaceBrightDarkMediumContrast,
        surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
        surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
        surfaceContainer = surfaceContainerDarkMediumContrast,
        surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
        surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
    )

    override val highContrastDarkColorScheme = darkColorScheme(
        primary = primaryDarkHighContrast,
        onPrimary = onPrimaryDarkHighContrast,
        primaryContainer = primaryContainerDarkHighContrast,
        onPrimaryContainer = onPrimaryContainerDarkHighContrast,
        secondary = secondaryDarkHighContrast,
        onSecondary = onSecondaryDarkHighContrast,
        secondaryContainer = secondaryContainerDarkHighContrast,
        onSecondaryContainer = onSecondaryContainerDarkHighContrast,
        tertiary = tertiaryDarkHighContrast,
        onTertiary = onTertiaryDarkHighContrast,
        tertiaryContainer = tertiaryContainerDarkHighContrast,
        onTertiaryContainer = onTertiaryContainerDarkHighContrast,
        error = errorDarkHighContrast,
        onError = onErrorDarkHighContrast,
        errorContainer = errorContainerDarkHighContrast,
        onErrorContainer = onErrorContainerDarkHighContrast,
        background = backgroundDarkHighContrast,
        onBackground = onBackgroundDarkHighContrast,
        surface = surfaceDarkHighContrast,
        onSurface = onSurfaceDarkHighContrast,
        surfaceVariant = surfaceVariantDarkHighContrast,
        onSurfaceVariant = onSurfaceVariantDarkHighContrast,
        outline = outlineDarkHighContrast,
        outlineVariant = outlineVariantDarkHighContrast,
        scrim = scrimDarkHighContrast,
        inverseSurface = inverseSurfaceDarkHighContrast,
        inverseOnSurface = inverseOnSurfaceDarkHighContrast,
        inversePrimary = inversePrimaryDarkHighContrast,
        surfaceDim = surfaceDimDarkHighContrast,
        surfaceBright = surfaceBrightDarkHighContrast,
        surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
        surfaceContainerLow = surfaceContainerLowDarkHighContrast,
        surfaceContainer = surfaceContainerDarkHighContrast,
        surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
        surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
    )

}