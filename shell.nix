let
  sources = import ./nix/sources.nix;
  pkgs = import sources.nixpkgs { };
in pkgs.mkShell {
  buildInputs = with pkgs; [ jdk11 maven vault ];
  VAULT_ADDR = "http://127.0.0.1:8200";
}
