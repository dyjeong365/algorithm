class Solution {
    public boolean isRobotBounded(String instructions) {
        enum Directions {
            NORTH,
            SOUTH,
            WEST,
            EAST
        }

        Directions direction = Directions.NORTH;
        int x = 0;
        int y = 0;

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                switch (direction) {
                    case NORTH:
                        y++;
                        break;
                    case SOUTH:
                        y--;
                        break;
                    case WEST:
                        x--;
                        break;
                    case EAST:
                        x++;
                        break;
                }
            }

            else if (instruction == 'L') {
                switch (direction) {
                    case NORTH:
                        direction = Directions.WEST;
                        break;
                    case SOUTH:
                        direction = Directions.EAST;
                        break;
                    case WEST:
                        direction = Directions.SOUTH;
                        break;
                    case EAST:
                        direction = Directions.NORTH;
                        break;
                }
            }

            else if (instruction == 'R') {
                switch (direction) {
                    case NORTH:
                        direction = Directions.EAST;
                        break;
                    case SOUTH:
                        direction = Directions.WEST;
                        break;
                    case WEST:
                        direction = Directions.NORTH;
                        break;
                    case EAST:
                        direction = Directions.SOUTH;
                        break;
                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }

        // We check whether the direction is still North, then it will sure go out of
        // the circle, so return false.
        if (direction == Directions.NORTH) {
            return false;
        }

        return true;
    }
}