// Polymorphism: We can use polymorphism
//  to allow different objects to behave differently
//  depending on their type. For example, we can create
//   a function that accepts a Character object and calls
//    its attack method, which will behave differently
//    depending on whether the object is an instance of the Character or Enemy class.

void attackCharacter(Character &attacker, Character &other)
{
    attacker.attack(other);
}
