// Abstraction: We can use abstraction
//  to simplify the complexity of the game by
//  hiding the details of the character's behavior
//   and interactions from the game engine. For example, w
//   e can create a class called Game that provides high-level
//    methods for creating, accessing, and modifying characters
//    without exposing the details of their implementation.
class Game
{
private:
    vector<Character *> characters;

public:
    void addCharacter(Character *character)
    {
        characters.push_back(character);
    }

    Character *getPlayer() const
    {
        // Find the character with the highest speed (assumed to be the player)
        int maxSpeed = -1;
        Character *player = nullptr;
        for (Character *character : characters)
        {
            if (dynamic_cast<Enemy *>(character) == nullptr && character->isAlive() && character->getSpeed() > maxSpeed)
            {
                maxSpeed = character->getSpeed();
                player = character;
            }
        }
        return player;
    }

    void update()
    {
        Character *player = getPlayer();
        for (Character *character : characters)
        {
            if (character != player && character->isAlive())
            {
                if (dynamic_cast<Enemy *>(character) != nullptr)
                {
                    // Attack the player if close enough
                    if (abs(character->getX() - player->getX()) <= 10 && abs(character->getY() - player->getY()) <= 10)
                    {
                        dynamic_cast<Enemy *>(character)->attackPlayer(*player);
                    }
                }
                else
                {
                    // Move randomly
                    int dx = rand()

                        int dy = rand() % 3 - 1;
                    character->move(dx, dy);
                }
            }
        }
    }
};