/*
 * Copyright (c) 2008 Cameron Zemek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package net.zeminvaders.lang.ast;

import net.zeminvaders.lang.Interpreter;
import net.zeminvaders.lang.SourcePosition;
import net.zeminvaders.lang.runtime.ReturnException;
import net.zeminvaders.lang.runtime.ZemObject;

/**
 * Represents return statements. Return exits a function.
 *
 * @author <a href="mailto:grom@zeminvaders.net">Cameron Zemek</a>
 */
public class ReturnNode extends Node {
    private Node expression;

    public ReturnNode(SourcePosition pos, Node expression) {
        super(pos);
        this.expression = expression;
    }

    @Override
    public ZemObject eval(Interpreter interpreter) {
        throw new ReturnException(expression.eval(interpreter));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(return ");
        sb.append(expression);
        sb.append(')');
        return sb.toString();
    }
}
