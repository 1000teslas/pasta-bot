let pkgs = import <nixpkgs> { };
in pkgs.mkShell {
  buildInputs = with pkgs; [ maven vault ];
  VAULT_ADDR = "http://127.0.0.1:8200";
}
