package creational.prototype.BTA8;

import java.io.Serializable;

public interface IPrototype {
    Serializable copy();
    Object clone();
}
