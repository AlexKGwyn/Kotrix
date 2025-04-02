package com.kotrix.operations

import com.kotrix.complex.ComplexMatrix
import com.kotrix.real.Matrix
import com.kotrix.utils.R
import kotlin.math.pow

/**
 * Calculates an inverse matrix of a square matrix.
 *
 * @return inverse matrix. identity if not invertible.
 */
fun Matrix.inverse() : Matrix {
    if (rows != cols) throw IllegalArgumentException("Matrix.inverseMatrix: Only available for square matrices")
    val det = this.determinant()
    return if (det == 0.0) Matrix.identityMatrix(rows)
    else this.adjoint() * (det.pow(-1))
}

/**
 * Calculates an inverse matrix of a square matrix.
 *
 * @return inverse matrix. identity if not invertible.
 */
fun ComplexMatrix.inverse() : ComplexMatrix {
    if (rows != cols) throw IllegalArgumentException("ComplexMatrix.inverseMatrix: Only available for square matrices")
    val det = this.determinant()
    return if (det == 0.0.R) ComplexMatrix.identityMatrix(rows)
    else this.adjoint() / det
}