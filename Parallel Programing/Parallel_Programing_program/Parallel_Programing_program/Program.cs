using System;
using System.Threading.Tasks;


namespace Parallel_Programing_program
{
    internal static class Program
    {
        public static void write(char c)
        {
            int i = 1000;
            while(i --> 0){
                Console.Write(c);
            }
        }



        public static void Main(string[] args)
        {
            Task.Factory.StartNew(() => write('.'));

            var t = new Task(() => write('?'));
            t.Start();
            write('-');

            Console.WriteLine("Hello World!");
            Console.ReadKey();
        }
    }
}
