#define MAX RESOURCES 5
 int available resources = MAX RESOURCES;
/*When a process wishes to obtain a number of resources, it invokes the
decrease count() function:
*/
/* decrease available resources by count resources */
/* return 0 if sufficient resources available, */
/* otherwise return -1 */


int decrease_count(int count) {
if (available resources < count)
return -1;
else {
available resources -= count;
return 0;
}
}
/*When a process wants to return a number of resources, it calls the
increase count() function:
*/
/* increase available resources by count */
int increase_count(int count) {
available resources += count;
return 0;
}

int main(){
    decrease_count(int i);
}
