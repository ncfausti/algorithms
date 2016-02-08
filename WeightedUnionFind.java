/* API
WeightedQuickUnionUF(int N)                         init N sites with names 0-N-1
void union(int p, int q)          add connection between p and q
int find(int p)                   component id for p
boolean connected(int p, int q)   find(p) == find(q)
int count()                       num of components
*/

public class WeightedUnionFind
{
  private int[] id;
  private int[] sz;
  private int count;

  public WeightedUnionFind(int N)
  {
    count = N;
    id = new int[N];
    for (int i = 0; i < N; i++) id[i] = i;
    sz = new int[N];
    for (int i = 0; i < N; i++) sz[i] = 1;
  }
  public int count() { return count; }
  public boolean connected(int p, int q) { return find(p) == find(q); }
  public int find(int p)
  {  // quick-find
    while (p != id[p]) p = id[p];
    return p;
  }
  public void union(int p, int q)
  { // quick-union
    int i = find(p);
    int j = find(q);
    if (i == j) return;

    // Make smaller root point to larger one.
    if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
    if (sz[i] < sz[j]) { id[j] = i; sz[i] += sz[j]; }
    else
    count--;
  }
  public void printList()
  { for (int i = 0; i < 103; i++) StdOut.println("HI"); }

  public static void main(String[] args)
  {  // Solve dynamic connectivity problem on StdIn

    int N = StdIn.readInt();
    WeightedUnionFind uf = new WeightedUnionFind(N);
    while (!StdIn.isEmpty())
    {
      int p = StdIn.readInt();
      int q = StdIn.readInt();          // Read int pair
      if (uf.connected(p, q)) continue; // ignore if connected
      uf.union(p, q);
      StdOut.println(p + " " + q);
    }
    StdOut.println("hello2");
  //  StdOut.println(uf.count() + " components");
    uf.printList();
  }
}
