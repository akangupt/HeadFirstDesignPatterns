package chapter3;

/*
    Reference: Head First Design patterns
    The CondimentDecorator is extending the Beverage class. The point is that it’s vital that
    the decorators have the same type as the objects they are going to decorate. So here we’re
    using inheritance to achieve the type matching, but we aren’t using inheritance to get behavior.
    Decorators need the same “interface” as the components they wrap because they need to stand
    in place of the component.
    But when we "compose" a decorator with a component, we are adding new behavior. We are acquiring
    new behavior not by inheriting it from a superclass, but by composing objects together.
    We’re subclassing the abstract class Beverage in order to have the correct type, not to inherit
    its behavior. The behavior comes in through the composition of decorators with the base
    components as well as other decorators.
    And because we are using object composition, we get a whole lot more flexibility about how
    to mix and match condiments and beverages. If we rely on inheritance, then our behavior can
    only be determined statically at compile time. In other words, we get only whatever behavior
    the superclass gives us or that we override. With composition, we can mix and match decorators
    any way we like...at runtime.
    We can implement new decorators at any time to add new behavior. If we relied on inheritance,
    we’d have to go in and change existing code any time we wanted new behavior.
 */

public abstract class CondimentDecorator extends Beverage{

    // [important] abstract getDescription method extended from Beverage
    public abstract String getDescription();
}
