package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Ar: ImageVector
    get() {
        if (_ar != null) {
            return _ar!!
        }
        _ar = Builder(name = "Ar", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF88BBE8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF88BBE8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF4B32E)), stroke = SolidColor(Color(0xFFDB7A2C)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.0f, 12.3333f)
                    curveTo(15.2887f, 12.3333f, 16.3333f, 11.2887f, 16.3333f, 10.0f)
                    curveTo(16.3333f, 8.7113f, 15.2887f, 7.6667f, 14.0f, 7.6667f)
                    curveTo(12.7113f, 7.6667f, 11.6667f, 8.7113f, 11.6667f, 10.0f)
                    curveTo(11.6667f, 11.2887f, 12.7113f, 12.3333f, 14.0f, 12.3333f)
                    close()
                }
            }
        }
        .build()
        return _ar!!
    }

private var _ar: ImageVector? = null