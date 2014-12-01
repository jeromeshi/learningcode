#include <stdio.h>

int main(void) {
    int x = 0;
    int y = 0;
    int time = 0, action = -1;
    int interval = 0, initime = -1, mode = -1, direction = 0;
    int distance = 0;
    int dir = 0;

    while(1) {
        scanf("%d", &time);
        scanf("%d", &action);

        if ( initime == -1) {
            initime = time;
            interval = time - 0;
//            y += 10 * interval;
        }else {
            interval = time - initime;
            initime = time;
        }

        if (action == 3) {
            distance = interval * 10;
            dir = direction % 4;
            if(dir == 0) {
                y += distance;
            }else if (dir == 1) {
                x -= distance;
            }else if (dir == 2) {
                y -= distance;
            }else if (dir == 3) {
                 x += distance;
            }
            printf("%d  %d", x, y);
            break;
        }else if (action == 1) {
            mode = 1;
        }else if (action ==2){
            mode = 3;
        }else {
            printf("Wrong turn");
            break;
        }


        distance = interval * 10;
        dir = direction % 4;

//        printf("%d %d %d %d", interval, distance, x, y);
//        printf("\n");


        if(dir == 0) {
            y += distance;
        }else if (dir == 1) {
            x -= distance;
        }else if (dir == 2) {
            y -= distance;
        }else if (dir == 3) {
            x += distance;
        }

//        printf("%d %d", x, y);

        direction += mode;

    }




}
