/*BY AYUSH NIGAM
MNNIT-2ND YEAR
ayushmnnit@gmail.com*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<iostream>
#include<vector>
#include<cassert>
#include<sstream>
#include<map>
#include<set>
#include<stack>
#include<queue>
#include<algorithm>
using namespace std;
#define pb push_back
#define mp make_pair
#define clr(x) x.clear()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define REP(i,a,b) for(i=a;i<b;i++)
#define rep(i,b) for(i=0;i<b;i++)
#define rep1(i,b) for(i=1;i<=b;i++)
#define pdn(n) printf("%d\n",n)
#define sl(n) scanf("%lld",&n)
#define sd(n) scanf("%d",&n)
#define pn printf("\n")
#define qfx fornt().first
#define qfy front().second
#define getcx getchar_unlocked
typedef pair<int,int> PII;
typedef vector<PII> VPII;
typedef vector<int> VI;
typedef vector<VI> VVI;
typedef long long LL;
#define MOD 1000000007
int fast()
{
int ans=0;
char c=getcx();
while(c<'0'||c>'9')
c=getcx();
while(c>='0'&&c<='9')
{
ans=ans*10+(c-'0');
c=getcx();
}
return ans;
}
int main()
{
int n,i,a[1000],j,k;
scanf("%d",&n);
int ans1[n*n*n],ans2[n*n*n];
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
int c1=0;
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		for(k=0;k<n;k++)
		{
		if(a[k])
		ans1[c1++]=(a[i]+a[j])*a[k];
		}
	}
}
int c2=0;
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		for(k=0;k<n;k++)
		{
		ans2[c2++]=(a[i]*a[j])+a[k];
		}
	}
}
sort(ans1,ans1+c1);
sort(ans2,ans2+c2);
long long int ans;
int val;
//for(i=0;i<c;i++)
//printf("%d %d\n",ans1[i],ans2[i]);
for(i=0;i<c1;i++)
{
int *an1,*an2;
//printf("ans1[i]=%d ans2[i]=%d\n",ans1[i],ans2[i]);
an1=(int *)lower_bound(ans2,ans2+c2,ans1[i]);
an2=(int *)upper_bound(ans2,ans2+c2,ans1[i]);
long long int val=an2-an1;
//printf("*an2=%d *an1=%d\n",an2,an1);
ans=ans+val;
}
printf("%lld",ans);
return 0;
}
