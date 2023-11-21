/** @type {import('next').NextConfig} */
const nextConfig = {
  images: {
    domains: ["localhost", "m.media-amazon.com"],
    formats: ['image/avif', 'image/webp',],
    remotePatterns: [
      {
        protocol: 'https',
        hostname: 'm.media-amazon.com',
        port: '',
        pathname: '/images/M/**',
      },
    ],
  },
}

module.exports = nextConfig
