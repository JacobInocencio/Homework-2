public int triangle(int rows) 
{
  if (rows == 0)
  {
    return 0;
  }
  else return rows + triangle(rows - 1);
}

public int sumDigits(int n) 
{
  int total = n % 10;
  if (n/10 == 0)
  {
    return n;
  }
  else return total + sumDigits(n / 10);
}

public int powerN(int base, int n) 
{
  if (n == 1)
  {
    return base;
  }
  else return base * powerN(base, n-1);
}
