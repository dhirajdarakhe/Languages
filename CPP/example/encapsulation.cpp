// Sure, here's an example in C++ that showcases all four pillars of OOP for the video game scenario:

// Encapsulation: We can encapsulate the character's attributes and methods in a class called Character
// . We can use private variables to store the character's 
// attributes such as health, speed, and position, and 
// provide public methods for the game engine to interact with 
// the character, such as moving the character, attacking other characters
// ], and checking the character's health status.


class Character {
private:
    int health;
    int speed;
    int posX;
    int posY;

public:
    Character(int hp, int spd, int x, int y) :
        health(hp), speed(spd), posX(x), posY(y) {}

    void move(int dx, int dy) {
        posX += dx * speed;
        posY += dy * speed;
    }

    void attack(Character& other) {
        // Reduce other character's health
        other.health -= 10;
    }

    bool isAlive() const {
        return health > 0;
    }
};
