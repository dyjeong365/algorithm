class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;

        for (var command : commands) {
            if (command.equals("UP")) {
                x--;
            }

            else if (command.equals("RIGHT")) {
                y++;
            }

            else if (command.equals("DOWN")) {
                x++;
            }

            else if (command.equals("LEFT")) {
                y--;
            }
        }

        return (x * n) + y;
    }
}