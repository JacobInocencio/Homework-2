public int factorial(int n) 
{
  if (n == 1)
  {
    return 1;
  }
  else return n * factorial(n-1);
}

public int bunnyEars(int bunnies) 
{
  if (bunnies == 0)
  {
    return 0;
  }
  if (bunnies == 1)
  {
    return 2;
  }
  return 2 + bunnyEars(bunnies-1);
}

public int fibonacci(int n) 
{
  if (n == 0)
  {
    return 0;
  }
  if (n == 1 || n == 2)
  {
    return 1;
  }
  else return fibonacci(n-2) + fibonacci(n - 1);
}
