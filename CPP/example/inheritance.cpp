// Inheritance: We can use inheritance to create different types of
// characters with shared and unique attributes and
//  methods. For example, we can create a subclass of the Character
//   class called Enemy that has additional attributes such as damage
//   and methods such as attacking the player.

class Enemy : public Character
{
private:
    int damage;

public:
    Enemy(int hp, int spd, int x, int y, int dmg) : Character(hp, spd, x, y), damage(dmg) {}

    void attackPlayer(Character &player)
    {
        // Reduce player's health
        player.health -= damage;
    }
};
