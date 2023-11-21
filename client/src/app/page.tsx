"use client";

import Image from 'next/image'
import Link from 'next/link';

export default function Home() {
  return (
    <main>
      <h2>Flix.</h2>
      <p>
        <Link href="/hydration-stream-suspense">
          (recommended method): React Query With Streamed Hydration --- Bad for
          SEO
        </Link>
      </p>
      <p>
        <Link href="/initial-data">
          Prefetching Using initial data --- Good for SEO
        </Link>
      </p>
      <p>
        <Link href="/hydration">
          Prefetching Using Hydration --- Good for SEO
        </Link>
      </p>
    </main>
  );
}
